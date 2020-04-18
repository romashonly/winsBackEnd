package wins.backendwins.controller;

import org.springframework.web.bind.annotation.*;
import wins.backendwins.manager.UserDAO;
import wins.backendwins.model.DTO.UserDTO;

@RestController
@RequestMapping("users")
public class UsersController {

    private UserDAO userDAO = new UserDAO();

    @GetMapping("{id}")
    public UserDTO getUser(@PathVariable String id) {
        return userDAO.getUserByID(id);
    }

    @PostMapping
    public UserDTO createUser(@RequestBody UserDTO user) {

        userDAO.createUser(user);

        return user;
    }

    @PutMapping("{id}")
    public UserDTO updateUser(@PathVariable String id, @RequestBody UserDTO user) {

        return userDAO.updateUser(id, user);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable String id) {
        userDAO.deleteUser(id);
    }
}
