package wins.backendwins.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "challenges")
public class Challenge {

    @Id
    private String id;

    @OneToMany(mappedBy = "challenge", cascade = CascadeType.ALL)
    private List<Promocode> promocodes;

    private String trick_name;

    private String descript;

    private String boardShop;

    private boolean isDone;
    private boolean isChallenge;

    private long startDate;
    private long endDate;

    @ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.PERSIST } )
    @JsonIgnore
    @JoinTable(
            name = "actual_challenges",
            joinColumns = @JoinColumn(name = "challenge_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id"))
    private List<User> user;

    @ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.PERSIST } )
    @JsonIgnore
    @JoinTable(
            name = "done_challenges",
            joinColumns = @JoinColumn(name = "challenge_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id"))
    private List<User> winner_user;
}