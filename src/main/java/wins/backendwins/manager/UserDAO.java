package wins.backendwins.manager;

import wins.backendwins.model.DTO.TotalStatsDTO;
import wins.backendwins.model.DTO.TrickDTO;
import wins.backendwins.model.DTO.UserDTO;

import java.util.ArrayList;

public class UserDAO {

    private UserDTO defaultUser = UserDTO.builder()
            .login("roman")
            .password("roman")
            .id("1")
            .name("Roman")
            .city("Kazan")
            .age(20)
            .facebook("")
            .instagram("")
            .vkonakte("")
            .skateTrick(new ArrayList<TrickDTO>()  {
                {
                    add(new TrickDTO());
                    add(new TrickDTO());
                }
            })
            .scootTrick(new ArrayList<>())
            .bmxTrick(new ArrayList<>())
            .standIsRegular(true)
            .totalStats(new TotalStatsDTO())
            .promotionalСodes(new ArrayList<>())
            .build();

    public UserDTO getUserByID(String id) {
        return this.defaultUser;
    }

    public void createUser(UserDTO user) {

    }

    public UserDTO updateUser(String id, UserDTO user) {
        return this.defaultUser;
    }

    public void deleteUser(String id) {

    }
}
