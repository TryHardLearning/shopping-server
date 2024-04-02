package io.labs.shoppingserver.models.DTOs;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ItemShoppingBagDTO {
    @Id
    Long id;

    @OneToOne
    private ProductDTO product;

    private Integer quantity;

    private Double Cost;
}
