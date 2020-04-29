package wins.backendwins.manager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import wins.backendwins.model.entity.Challenge;

public interface ChallengeRepository extends JpaRepository<Challenge, Long> {
}
