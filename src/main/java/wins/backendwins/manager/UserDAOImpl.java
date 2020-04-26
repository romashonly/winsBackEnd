package wins.backendwins.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wins.backendwins.manager.repository.PromocodeRepository;
import wins.backendwins.manager.repository.TotalStatsRepository;
import wins.backendwins.manager.repository.TrickRepository;
import wins.backendwins.manager.repository.UserRepository;
import wins.backendwins.model.entity.User;

import java.util.ArrayList;

@Service
public class UserDAOImpl implements UserDAO {

    @Autowired
    private UserRepository usersRepository;

    @Autowired
    private TotalStatsRepository totalStatsRepository;

    @Autowired
    private TrickRepository trickRepository;

    @Autowired
    private PromocodeRepository promocodeRepository;

    @Override
    public User getUserByID(String id) {
        return usersRepository.findById(id);
    }

    @Override
    public void createUser(User user) {

        saveOrUpdateUser(user);
    }

    @Override
    public User updateUser(String id, User user) {

        saveOrUpdateUser(user);

        return user;
    }

    private void saveOrUpdateUser(User user) {

        //Сначала сохраняем юзера со всеми моделями
        usersRepository.save(user);

        //Потом проставляем всем моделям id юзера и заново сохраняем
        user.getSkateTrick().forEach(trick -> trick.setUser_skate(user));
        trickRepository.saveAll(user.getSkateTrick());

        user.getScootTrick().forEach(trick -> trick.setUser_scoot(user));
        trickRepository.saveAll(user.getScootTrick());

        user.getBmxTrick().forEach(trick -> trick.setUser_bmx(user));
        trickRepository.saveAll(user.getBmxTrick());

        user.getPromotionalСodes().forEach(promocode -> promocode.setUser(user));
        promocodeRepository.saveAll(user.getPromotionalСodes());
    }


    @Override
    public void deleteUser(String id) {
        usersRepository.delete(usersRepository.findById(id));
    }

}
