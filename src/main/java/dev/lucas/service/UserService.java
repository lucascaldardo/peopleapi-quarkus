package dev.lucas.service;

import dev.lucas.domain.Users;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class UserService {


    public Users createUser(Users users) {
        users.persist();
        return users;
    }

}
