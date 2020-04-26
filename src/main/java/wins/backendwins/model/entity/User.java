package wins.backendwins.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;
import org.hibernate.engine.internal.Cascade;
import wins.backendwins.model.dto.PromocodeDTO;
import wins.backendwins.model.dto.TotalStatsDTO;
import wins.backendwins.model.dto.TrickDTO;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "users")
public class User {


    private String login;
    private String password;
    @Id
    private String id;

    private String name;
    private String city;
    private int age;

    private String facebook;
    private String instagram;
    private String vkonakte;

    @OneToMany(mappedBy = "user_skate", cascade = CascadeType.ALL)
    private List<Trick> skateTrick;
    @OneToMany(mappedBy = "user_scoot", cascade = CascadeType.ALL)
    private List<Trick> scootTrick;
    @OneToMany(mappedBy = "user_bmx", cascade = CascadeType.ALL)
    private List<Trick> bmxTrick;

    private String avatarImageData;

    private boolean standIsRegular;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="total_stats_id")
    private TotalStats totalStats;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Promocode> promotionalСodes;
}
