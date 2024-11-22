package io.labs.shoppingserver.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.Collection;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ShoppingBag {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter
    @NotNull
    @OneToMany
    /*@OneToMany(mappedBy = "shoppingBag", cascade = CascadeType.ALL, fetch = FetchType.LAZY)*/
    private List<ItemShoppingBag> items;

    @NotNull @ManyToOne
    private User user;

}
