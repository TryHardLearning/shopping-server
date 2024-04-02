package io.labs.shoppingserver.repositories;

import io.labs.shoppingserver.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserRepository, Long> {
    User findUserByEmail(String email);
}
