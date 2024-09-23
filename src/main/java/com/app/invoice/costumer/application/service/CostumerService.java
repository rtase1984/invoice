package com.app.invoice.costumer.application.service;

import java.util.List;
import java.util.Optional;

import com.app.invoice.costumer.domain.model.Costumer;
import com.app.invoice.costumer.domain.port.in.CostumerUseCases;

public class CostumerService implements CostumerUseCases {

    private final CostumerUseCases costumerUseCases;

    public CostumerService(CostumerUseCases costumerUseCases){
        this.costumerUseCases = costumerUseCases;
    }

    @Override
    public Costumer createCostumer(Costumer costumer) {
       return costumerUseCases.createCostumer(costumer);
    }

    @Override
    public Optional<Costumer> updateCostumer(Long idCostumer, Costumer costumer) {
       return costumerUseCases.updateCostumer(idCostumer, costumer);
    }

    @Override
    public boolean deleteCostumer(Long idCostumer) {
       return costumerUseCases.deleteCostumer(idCostumer);
    }

    @Override
    public Optional<Costumer> getCostumerById(Long idCostumer) {
        return costumerUseCases.getCostumerById(idCostumer);
    }

    @Override
    public List<Costumer> getAllCostumers() {
        return costumerUseCases.getAllCostumers();
    }

}
