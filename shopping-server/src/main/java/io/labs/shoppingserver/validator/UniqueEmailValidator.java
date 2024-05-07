package io.labs.shoppingserver.validator;

import io.labs.shoppingserver.annotation.UniqueEmail;
import io.labs.shoppingserver.repositories.UserRepository;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.beans.factory.annotation.Autowired;

public class UniqueEmailValidator implements ConstraintValidator<UniqueEmail, String> {
    @Autowired
    private UserRepository userRepository;

    @Override
    public boolean isValid(String email, ConstraintValidatorContext constraintValidatorContext) {
        return userRepository.findByUsername(email) == null;
    }
}
