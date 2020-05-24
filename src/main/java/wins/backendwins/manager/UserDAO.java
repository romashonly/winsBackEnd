package wins.backendwins.manager;

import wins.backendwins.model.entity.Challenge;
import wins.backendwins.model.entity.User;

import java.util.List;

public interface UserDAO {
    User getUserByID(String id);

    void createUser(User user);

    User updateUser(String id, User user);

    void deleteUser(String id);

    List<Challenge> getActualChallenges(String user_id);
}
