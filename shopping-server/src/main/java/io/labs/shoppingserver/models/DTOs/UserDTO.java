package io.labs.shoppingserver.models.DTOs;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "Costumer")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDTO {
    @Id
    private Long id;

    private String name;

    private String email;

    private String password;
}
