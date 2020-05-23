package wins.backendwins.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import wins.backendwins.manager.UserDAOImpl;
import wins.backendwins.model.BoolRequest;
import wins.backendwins.model.entity.User;

@RestController
@RequestMapping("users")
public class UsersController {

    @Autowired
    private UserDAOImpl userDAO;

    @GetMapping(value = "{id}", produces = "application/json")
    public User getUser(@PathVariable String id) {
        return userDAO.getUserByID(id);
    }

    @GetMapping("check/login")
    public BoolRequest checkOriginLogin(@RequestParam String login) {

        boolean isOrigin = userDAO.checkOriginLogin(login);

        return BoolRequest.builder().value(isOrigin).build();
    }

    @GetMapping("check")
    public BoolRequest checkCorrectLoginAndPassword(@RequestParam String login, @RequestParam String password) {

        User user = userDAO.checkCorrectLoginAndPassword(login, password);

        boolean isCorrect = user != null;

        String id = "";

        if (isCorrect) {
            id = user.getId();
        }

        return BoolRequest.builder().value(isCorrect).id(id).build();
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
