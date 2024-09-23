package com.app.invoice.costumer.domain.port.out;

import java.util.List;
import java.util.Optional;



import com.app.invoice.costumer.domain.model.Costumer;

public interface CostumerRepositoryPort {
    Costumer save(Costumer costumer); 
    Optional<Costumer> update(Long idCostumer, Costumer costumer);
    boolean deleteById(Long idCostumer);
    Optional<Costumer> findById(Long idCostumer);
    List<Costumer> findAll();
}
