package wins.backendwins.manager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import wins.backendwins.model.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findById(String id);
}
