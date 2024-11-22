package io.labs.shoppingserver.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ItemShoppingBag {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne @NotNull
    private Product product;

    @NotNull
    private int quantity;

    @NotNull
    private double cost;

    @ManyToOne @NotNull
    private User user;

    @ManyToOne
    /*@JoinColumn(name = "shopping_bag_id", referencedColumnName = "id") // Correct join column definition*/
    private ShoppingBag shoppingBag;
}
