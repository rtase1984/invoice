package com.app.invoice.product.infrastructure.controllers;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.invoice.product.application.service.ProductService;
import com.app.invoice.product.domain.model.Product;
import com.app.invoice.product.infrastructure.dto.ProductDTO;
import com.app.invoice.product.infrastructure.mappers.ProductMapper;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    public ResponseEntity<Product> criarDepartamento(@RequestBody Product product) {
        Product created = productService.createProduct(product);
        return ResponseEntity.status(201).body(created);
    }

    @GetMapping
    public ResponseEntity<List<ProductDTO>> buscarTodos() {
        List<Product> products = productService.getAllProducts();
        List<ProductDTO>  productsDTO = products.stream()
                                                .map(ProductMapper.INSTANCE::toDTO)
                                                .collect(Collectors.toList());
        return ResponseEntity.ok(productsDTO);

    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> buscarPorId(@PathVariable Long id) {
        Optional<Product> product = productService.getProductById(id);
        return  ResponseEntity.ok(product.orElse(null));
    }

    

}
