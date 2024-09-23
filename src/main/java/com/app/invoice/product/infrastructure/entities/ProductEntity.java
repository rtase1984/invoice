package com.app.invoice.product.infrastructure.entities;

import java.util.List;

import com.app.invoice.invoice.domain.model.InvoiceDetail;
import com.app.invoice.invoice.infrastructure.entities.InvoiceDetailEntity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToMany;
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
@Table(name  = "product")
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String  name;
    private Double unitPrice;
    private String  description;
    private String category;
    private String image;
    private String qrCodeUrl;
    @Lob
    private byte[] qrCodeImage;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "product", cascade = CascadeType.ALL)
    private List<InvoiceDetailEntity> invoiceDetails;

}
