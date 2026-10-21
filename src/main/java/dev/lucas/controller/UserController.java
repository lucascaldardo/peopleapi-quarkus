package dev.lucas.controller;

import dev.lucas.domain.Users;
import dev.lucas.service.UserService;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

@Path("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @POST
    @Transactional
    public Response createUser(Users users){
        return Response.ok(userService.createUser(users)).build();
    }

}
