package wins.backendwins.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "total_statistics")
public class TotalStats {

    @Id
    private String id;

    private double technicality;
    private double stability;
    private double percentageTricksLearned;

    @OneToOne(mappedBy = "totalStats")
    @JsonIgnore
    private User user;
}
