package wins.backendwins.manager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import wins.backendwins.model.entity.Trick;

public interface TrickRepository extends JpaRepository<Trick, Long> {
}
