package org.example.connectpay.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Data;
import java.math.BigDecimal;

@Data // Lombok para criar getters e setters
public class PagamentoRequestDTO {

    @NotBlank(message = "O nome do favorecido não pode estar em branco")
    private String favorecido;

    @NotBlank(message = "O código de barras é obrigatório")
    private String codigoBarras;

    @Positive(message = "O valor deve ser um número positivo")
    private BigDecimal valor;
}