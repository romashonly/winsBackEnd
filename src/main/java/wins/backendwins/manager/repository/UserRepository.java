package wins.backendwins.manager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import wins.backendwins.model.entity.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    User findById(String id);

    User findByLogin(String login);

    User findByLoginAndPassword(String login, String password);
}
