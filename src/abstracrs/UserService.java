package abstracrs;

import entities.User;

public interface UserService {
    void register(User user);
    void deleteAccount(User user);
    void updateProfile(User user);
}
