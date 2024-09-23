package com.app.invoice.costumer.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Costumer {
    private Long id;
    private String costumerName;
    private String email;
    private String phone;
    private String address;
}
