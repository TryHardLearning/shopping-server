package io.labs.shoppingserver.security;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AuthenticationResponseDto {

    private String token;

}
