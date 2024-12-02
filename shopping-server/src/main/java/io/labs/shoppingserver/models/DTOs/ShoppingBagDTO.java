package io.labs.shoppingserver.models.DTOs;

import io.labs.shoppingserver.models.ItemShoppingBag;
import io.labs.shoppingserver.models.User;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ShoppingBagDTO {

    private Long id;

    private List<ItemShoppingBag> items = new ArrayList<>();

    @NotNull
    private User user;
}
