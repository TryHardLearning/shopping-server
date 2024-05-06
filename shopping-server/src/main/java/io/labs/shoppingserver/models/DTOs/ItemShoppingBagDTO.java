package io.labs.shoppingserver.models.DTOs;

import io.labs.shoppingserver.models.Product;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ItemShoppingBagDTO {

    Long id;

    @OneToOne @NotNull
    private Product product;

    @NotNull
    private Integer quantity;

    @NotNull
    private Double cost;
}
