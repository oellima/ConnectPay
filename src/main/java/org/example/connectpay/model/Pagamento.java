package org.example.connectpay.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Data;
import java.math.BigDecimal;

@Entity
@Table(name = "tb_pagamentos")
@Data // Gerado pelo Lombok
public class Pagamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O nome do favorecido é obrigatório")
    private String favorecido;

    @NotBlank(message = "O código de barras é obrigatório")
    private String codigoBarras;

    @Positive(message = "O valor deve ser maior que zero")
    private BigDecimal valor;

    private String status; // Ex: PENDENTE, PAGO, CANCELADO
}