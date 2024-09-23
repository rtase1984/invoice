package com.app.invoice.costumer.application.usecases;

import java.util.List;
import java.util.Optional;

import com.app.invoice.costumer.domain.model.Costumer;
import com.app.invoice.costumer.domain.port.in.CostumerUseCases;
import com.app.invoice.costumer.domain.port.out.CostumerRepositoryPort;

public class CostumerUseCasesImp implements CostumerUseCases{

    private final CostumerRepositoryPort costumerRepositoryPort;

    public CostumerUseCasesImp(CostumerRepositoryPort costumerRepositoryPort){
        this.costumerRepositoryPort = costumerRepositoryPort;
    }

    @Override
    public Costumer createCostumer(Costumer costumer) {
        return costumerRepositoryPort.save(costumer);
    }

    @Override
    public Optional<Costumer> updateCostumer(Long idCostumer, Costumer costumer) {
        return costumerRepositoryPort.update(idCostumer, costumer);
    }

    @Override
    public boolean deleteCostumer(Long idCostumer) {
        return costumerRepositoryPort.deleteById(idCostumer);
    }

    @Override
    public Optional<Costumer> getCostumerById(Long idCostumer) {
      return costumerRepositoryPort.findById(idCostumer);
    }

    @Override
    public List<Costumer> getAllCostumers() {
        return costumerRepositoryPort.findAll();
    }

}
