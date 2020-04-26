package wins.backendwins.manager;

import wins.backendwins.model.entity.User;

public interface UserDAO {
    User getUserByID(String id);

    void createUser(User user);

    User updateUser(String id, User user);

    void deleteUser(String id);
}
