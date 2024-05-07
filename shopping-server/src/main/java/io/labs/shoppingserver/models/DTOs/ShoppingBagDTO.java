package io.labs.shoppingserver.models.DTOs;

import io.labs.shoppingserver.models.ItemShoppingBag;
import io.labs.shoppingserver.models.User;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ShoppingBagDTO {

    private Long id;

    @OneToMany @NotNull
    List<ItemShoppingBag> ProductItems;

    @ManyToOne
    @NotNull
    private User user;
}
