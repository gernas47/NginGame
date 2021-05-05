package abstracrs;

import entities.User;

public interface UserCheckService {
    boolean checkIfRealPerson(User user);
}
