package io.labs.shoppingserver.models.DTOs;

import io.labs.shoppingserver.models.Product;
import io.labs.shoppingserver.models.ShoppingBag;
import jakarta.persistence.*;
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

    @NotNull
    private Product product;

    @NotNull
    private Integer quantity;

    @NotNull
    private Double cost;

    private ShoppingBag shoppingBag;
}
