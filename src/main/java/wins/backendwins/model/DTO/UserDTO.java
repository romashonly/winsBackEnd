package wins.backendwins.model.DTO;

import lombok.Builder;

import java.util.List;

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

//    private String avatarImageData;

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
        this.standIsRegular = standIsRegular;
        this.totalStats = totalStats;
        this.promotionalСodes = promotionalСodes;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public int getAge() {
        return age;
    }

    public String getFacebook() {
        return facebook;
    }

    public String getInstagram() {
        return instagram;
    }

    public String getVkonakte() {
        return vkonakte;
    }

    public List<TrickDTO> getSkateTrick() {
        return skateTrick;
    }

    public List<TrickDTO> getScootTrick() {
        return scootTrick;
    }

    public List<TrickDTO> getBmxTrick() {
        return bmxTrick;
    }

    public boolean isStandIsRegular() {
        return standIsRegular;
    }

    public TotalStatsDTO getTotalStats() {
        return totalStats;
    }

    public List<PromocodeDTO> getPromotionalСodes() {
        return promotionalСodes;
    }
}
