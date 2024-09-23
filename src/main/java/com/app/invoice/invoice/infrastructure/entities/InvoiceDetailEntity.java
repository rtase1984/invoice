package com.app.invoice.invoice.infrastructure.entities;

import com.app.invoice.product.infrastructure.entities.ProductEntity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "invoice_detail")
public class InvoiceDetailEntity {
    @Id
    @GeneratedValue(strategy  = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "invoiceId")
    private InvoiceEntity invoice;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "productId")
    private ProductEntity product;
}
