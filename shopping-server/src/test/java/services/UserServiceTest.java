package services;

import io.labs.shoppingserver.models.User;
import io.labs.shoppingserver.repositories.UserRepository;
import io.labs.shoppingserver.services.implement.CrudServiceImpl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class UserServiceTest extends CrudServiceImpl<User, Long> {

    private final UserRepository repository;

    public UserServiceTest(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    protected JpaRepository<User, Long> getRepository() {
        return this.repository;
    }
}
