package io.labs.shoppingserver.models;

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
public class ItemShoppingBag {

    @OneToOne @NotNull
    private Product product;

    @NotNull
    private Integer quantity;

    @NotNull
    private Double cost;
}
