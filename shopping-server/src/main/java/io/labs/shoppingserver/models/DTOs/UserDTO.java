package io.labs.shoppingserver.models.DTOs;

import io.labs.shoppingserver.annotation.UniqueEmail;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDTO {

    private Long id;

    @NotNull @Size(min = 6)
    private String username;

    @NotNull
    @Size(min = 6)
    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).*$",
            message = "{br.edu.pb.utfpr.pw25s.server.user.password.Pattern}")
    private String password;

    @NotNull
    @Size(min = 4, max = 255)
    private String displayName;

    // Remove UserDetails methods as they're not relevant for DTOs
}