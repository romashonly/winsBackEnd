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
@Table(name = "promocodes")
public class Promocode {

    @Id
    private String id;

    private String code;

    @ManyToOne()
    @JsonIgnore
    @JoinColumn(name = "challenge_id")
    private Challenge challenge;
}
