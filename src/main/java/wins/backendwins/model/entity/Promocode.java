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
    private String promocode;

    private String trickName;
    private String boardshop;
    private int startDate;
    private int endDate;

    @ManyToOne()
    @JsonIgnore
    @JoinColumn(name = "user_id")
    private User user;
}