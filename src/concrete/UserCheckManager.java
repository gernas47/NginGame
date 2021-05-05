package concrete;

import abstracrs.UserCheckService;
import entities.User;

public class UserCheckManager implements UserCheckService {
    @Override
    public boolean checkIfRealPerson(User user) {
        return true;
    }
}
