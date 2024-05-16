package io.labs.shoppingserver.services;

import io.labs.shoppingserver.models.User;
import io.labs.shoppingserver.repositories.UserRepository;
import io.labs.shoppingserver.services.implement.CrudServiceImpl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService extends CrudServiceImpl<User, Long> {

    private final UserRepository repository;
    private final PasswordEncoder passwordEncoder;

    public UserService(UserRepository repository, PasswordEncoder passwordEncoder) {
        this.repository = repository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    protected JpaRepository<User, Long> getRepository() {
        return this.repository;
    }

    @Override
    public User save(User entity) {
        entity.setPassword(passwordEncoder.encode(entity.getPassword()));
        return repository.save(entity);
    }

    @Override
    public User saveAndFlush(User entity) {
        entity.setPassword(passwordEncoder.encode(entity.getPassword()));
        return repository.saveAndFlush(entity);
    }

}
