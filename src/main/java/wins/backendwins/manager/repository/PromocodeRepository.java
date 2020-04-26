package wins.backendwins.manager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import wins.backendwins.model.entity.Promocode;

public interface PromocodeRepository extends JpaRepository<Promocode, Long> {
}
