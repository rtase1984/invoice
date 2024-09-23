package com.app.invoice.costumer.infrastructure.repositories;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.app.invoice.costumer.domain.model.Costumer;
import com.app.invoice.costumer.domain.port.out.CostumerRepositoryPort;
import com.app.invoice.costumer.infrastructure.entities.CostumerEntity;
import com.app.invoice.costumer.infrastructure.mappers.CostumerMapper;

@Repository
public class CostumerRepositoryImpl implements CostumerRepositoryPort{

    private final JpaCostumerRepository jpaCostumerRepository;

    
    public CostumerRepositoryImpl(JpaCostumerRepository jpaCostumerRepository) {
        this.jpaCostumerRepository = jpaCostumerRepository;
    }

    @Override
    public Costumer save(Costumer costumer) {
        CostumerEntity costumerEntity = CostumerMapper.INSTANCE.toEntity(costumer);
        CostumerEntity savedCostumer = jpaCostumerRepository.save(costumerEntity);
        return CostumerMapper.INSTANCE.toDomain(savedCostumer);
    }

    @Override
    public Optional<Costumer> update(Long idCostumer, Costumer costumer) {
        if (jpaCostumerRepository.existsById(costumer.getId())) {
            CostumerEntity costumerEntity = CostumerMapper.INSTANCE.toEntity(costumer);
            CostumerEntity updatedEntity = jpaCostumerRepository.save(costumerEntity);
            return Optional.of(CostumerMapper.INSTANCE.toDomain(updatedEntity));
        }
        return Optional.empty();

    }

    @Override
    public boolean deleteById(Long idCostumer) {
        if (jpaCostumerRepository.existsById(idCostumer)) {
            jpaCostumerRepository.deleteById(idCostumer);
            return true;
        }
        return false;
    }

    @Override
    public Optional<Costumer> findById(Long idCostumer) {
        return jpaCostumerRepository.findById(idCostumer)
                        .map(CostumerMapper.INSTANCE::toDomain);
        
    }

    @Override
    public List<Costumer> findAll() {
        return jpaCostumerRepository.findAll()
            .stream()
            .map(CostumerMapper.INSTANCE::toDomain)
            .collect(Collectors.toList());
    }

}
