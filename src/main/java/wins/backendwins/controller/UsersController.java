package wins.backendwins.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import wins.backendwins.manager.UserDAOImpl;
import wins.backendwins.model.entity.User;

@RestController
@RequestMapping("users")
public class UsersController {

    @Autowired
    private UserDAOImpl userDAO;

    @GetMapping("{id}")
    public User getUser(@PathVariable String id) {
        return userDAO.getUserByID(id);
    }

    @PostMapping
    public User createUser(@RequestBody User user) {

        userDAO.createUser(user);

        return user;
    }

    @PutMapping("{id}")
    public User updateUser(@PathVariable String id, @RequestBody User user) {

        return userDAO.updateUser(id, user);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable String id) {
        userDAO.deleteUser(id);
    }
}
