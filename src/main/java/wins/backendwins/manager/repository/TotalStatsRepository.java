package wins.backendwins.manager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import wins.backendwins.model.entity.TotalStats;
import wins.backendwins.model.entity.Trick;

public interface TotalStatsRepository extends JpaRepository<TotalStats, Long> {
    Trick findById(String id);
}
