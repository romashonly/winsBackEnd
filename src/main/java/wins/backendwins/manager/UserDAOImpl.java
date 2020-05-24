package wins.backendwins.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wins.backendwins.manager.repository.ChallengeRepository;
import wins.backendwins.manager.repository.TotalStatsRepository;
import wins.backendwins.manager.repository.TrickRepository;
import wins.backendwins.manager.repository.UserRepository;
import wins.backendwins.model.entity.Challenge;
import wins.backendwins.model.entity.User;

import java.util.List;

@Service
public class UserDAOImpl implements UserDAO {

    @Autowired
    private UserRepository usersRepository;

    @Autowired
    private TotalStatsRepository totalStatsRepository;

    @Autowired
    private TrickRepository trickRepository;

    @Autowired
    private ChallengeRepository challengeRepository;

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

        user.getChallenges().forEach(challenge -> challenge.getUser().add(user));
        challengeRepository.saveAll(user.getChallenges());

        user.getDoneChallenges().forEach(challenge -> challenge.getWinner_user().add(user));
        challengeRepository.saveAll(user.getDoneChallenges());
//        user.getPromotionalСodes().forEach(challenge -> challenge.setUser(user));
//        promocodeRepository.saveAll(user.getPromotionalСodes());
    }


    @Override
    public void deleteUser(String id) {
        usersRepository.delete(usersRepository.findById(id));
    }

    @Override
    public List<Challenge> getActualChallenges(String user_id) {

        User user = usersRepository.findById(user_id);

        return user.getChallenges();
    }

    public boolean checkOriginLogin(String login) {

        return usersRepository.findByLogin(login) == null;
    }

    public User checkCorrectLoginAndPassword(String login, String password) {

        return usersRepository.findByLoginAndPassword(login, password);
    }

}
