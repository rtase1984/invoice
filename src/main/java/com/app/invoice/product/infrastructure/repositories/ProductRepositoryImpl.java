package com.app.invoice.product.infrastructure.repositories;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.invoice.product.domain.model.Product;
import com.app.invoice.product.domain.port.out.ProductRepositoryPort;
import com.app.invoice.product.infrastructure.entities.ProductEntity;
import com.app.invoice.product.infrastructure.mappers.ProductMapper;
import com.app.invoice.shared.infrastructure.exceptions.DatabaseException;

@Repository
public class ProductRepositoryImpl implements ProductRepositoryPort{

    private final ProductJpaRepository repository;

    @Autowired
    public ProductRepositoryImpl(ProductJpaRepository repository) {
        this.repository = repository;
    }

    @Override
    public Product save(Product product) {
        try {
            ProductEntity entity = ProductMapper.INSTANCE.toEntity(product);
            ProductEntity productSaved =  repository.save(entity);
            return  ProductMapper.INSTANCE.toDomain(productSaved);
            
        } catch (Exception e) {
             throw new DatabaseException("Error al guardar el producto", e);
        }
        
    }

    @Override
    public Optional<Product> update(Long idProduct, Product product) {
        try {
            // Buscamos la entidad en la base de datos por el ID
            return repository.findById(idProduct).map(existingProductEntity -> {
                // Actualizamos la entidad con los valores del objeto de dominio
                updateEntityFromDomain(existingProductEntity, product);
    
                // Guardamos los cambios en la base de datos
                ProductEntity updatedProductEntity = repository.save(existingProductEntity);
    
                // Convertimos la entidad actualizada al dominio y la devolvemos
                return Optional.of(ProductMapper.INSTANCE.toDomain(updatedProductEntity));
            }).orElse(Optional.empty());  // Si no se encuentra el producto, devolvemos Optional.empty()
            
        } catch (Exception e) {
            // Lanzamos una excepción personalizada en caso de error
            throw new DatabaseException("Error al actualizar el producto con id " + idProduct, e);
        }
    }
    


    @Override
    public boolean deleteById(Long idProduct) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteById'");
    }

    @Override
    public Optional<Product> findById(Long idProduct) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public List<Product> findAll() {
        return  repository.findAll()
                          .stream()
                          .map(ProductMapper.INSTANCE::toDomain)
                          .collect(Collectors.toList());
    }

    private void updateEntityFromDomain(ProductEntity entity, Product product) {
        if (product.getName() != null && !product.getName().isEmpty()) {
            entity.setName(product.getName());
        }
        if (product.getUnitPrice() != null && product.getUnitPrice() > 0) {
            entity.setUnitPrice(product.getUnitPrice());
        }
        if (product.getDescription() != null && !product.getDescription().isEmpty()) {
            entity.setDescription(product.getDescription());
        }
        if (product.getCategory() != null && !product.getCategory().isEmpty()) {
            entity.setCategory(product.getCategory());
        }
        if (product.getImage() != null && !product.getImage().isEmpty()) {
            entity.setImage(product.getImage());
        }
        if (product.getQrCode() != null && !product.getQrCode().isEmpty()) {
            entity.setQrCode(product.getQrCode());
        }
        // Agregar más campos según sea necesario, incluyendo validaciones
    }
    

}
