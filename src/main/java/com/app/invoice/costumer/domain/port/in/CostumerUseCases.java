package com.app.invoice.costumer.domain.port.in;

import java.util.List;
import java.util.Optional;

import com.app.invoice.costumer.domain.model.Costumer;

public interface CostumerUseCases {
    Costumer createCostumer(Costumer costumer);
    Optional<Costumer> updateCostumer(Long idCostumer, Costumer costumer);
    boolean deleteCostumer(Long idCostumer);
    Optional<Costumer> getCostumerById(Long idCostumer);
    List<Costumer> getAllCostumers();

}
