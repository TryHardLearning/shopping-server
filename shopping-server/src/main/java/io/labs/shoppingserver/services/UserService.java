package io.labs.shoppingserver.services;

import io.labs.shoppingserver.repositories.UserRepository;
import io.labs.shoppingserver.services.CRUD.CrudServiceImpl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService extends CrudServiceImpl<UserRepository, Long> {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    protected JpaRepository<UserRepository, Long> getRepository() {
        return this.repository;
    }
}
