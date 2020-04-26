package wins.backendwins.model.entity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "tricks")
public class Trick {

    @Id
    private String id;

    private String name;
    private double complexity;
    private int stability;
    private int tries;

    @ManyToOne()
    @JsonIgnore
    @JoinColumn(name = "user_id_skate")
    private User user_skate;

    @ManyToOne()
    @JsonIgnore
    @JoinColumn(name = "user_id_scoot")
    private User user_scoot;

    @ManyToOne()
    @JsonIgnore
    @JoinColumn(name = "user_id_bmx")
    private User user_bmx;
}
