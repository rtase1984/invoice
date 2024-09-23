package com.app.invoice.costumer.infrastructure.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.invoice.costumer.infrastructure.repositories.CostumerRepositoryImpl;


@RestController
@RequestMapping("/customer")
public class CostumerController {
    @Autowired
    private  final CostumerRepositoryImpl costumerService;

    public  CostumerController(CostumerRepositoryImpl costumerService) {
        this.costumerService = costumerService;
    }

}
