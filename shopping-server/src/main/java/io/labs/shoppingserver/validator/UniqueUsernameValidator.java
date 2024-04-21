package io.labs.shoppingserver.validator;

import io.labs.shoppingserver.annotation.UniqueUsername;
import io.labs.shoppingserver.repositories.UserRepository;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.beans.factory.annotation.Autowired;

public class UniqueUsernameValidator implements ConstraintValidator<UniqueUsername, String> {

    @Autowired
    UserRepository userRepository;

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        if (userRepository.findByUsername(s) == null) {
            return true;
        }
        return false;
    }
}
