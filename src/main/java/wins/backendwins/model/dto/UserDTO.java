package wins.backendwins.model.dto;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Data
@Builder
public class UserDTO {

    private String login;
    private String password;
    private String id;

    private String name;
    private String city;
    private int age;

    private String facebook;
    private String instagram;
    private String vkonakte;

    private List<TrickDTO> skateTrick;
    private List<TrickDTO> scootTrick;
    private List<TrickDTO> bmxTrick;

    private String avatarImageData;

    private boolean standIsRegular;

    private TotalStatsDTO totalStats;
    private List<PromocodeDTO> promotionalСodes;

    public UserDTO(
            String login,
            String password,
            String id,
            String name,
            String city,
            int age,
            String facebook,
            String instagram,
            String vkonakte,
            List<TrickDTO> skateTrick,
            List<TrickDTO> scootTrick,
            List<TrickDTO> bmxTrick,
            String avatarImageData,
            boolean standIsRegular,
            TotalStatsDTO totalStats,
            List<PromocodeDTO> promotionalСodes
    ) {
        this.login = login;
        this.password = password;
        this.id = id;
        this.name = name;
        this.city = city;
        this.age = age;
        this.facebook = facebook;
        this.instagram = instagram;
        this.vkonakte = vkonakte;
        this.skateTrick = skateTrick;
        this.scootTrick = scootTrick;
        this.bmxTrick = bmxTrick;
        this.avatarImageData = avatarImageData;
        this.standIsRegular = standIsRegular;
        this.totalStats = totalStats;
        this.promotionalСodes = promotionalСodes;
    }
}
