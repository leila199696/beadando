package com.bead.netkaja.repository;

import com.bead.netkaja.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{
    Optional<User> findByUserName(String username);

    Optional<User> findByUserNameAndPassword(String username, String password);
}