package concrete;

import abstracrs.UserCheckService;
import abstracrs.UserService;
import entities.User;

public class UserManager implements UserService {

    private UserCheckService _userCheckService;

    public UserManager(UserCheckService userCheckService){
        _userCheckService = userCheckService;
    }

    @Override
    public void register(User user) {
        UserCheckOperation(user, "kaydedildi");
    }

    @Override
    public void deleteAccount(User user) {
        System.out.println(user.getFirstName() + ": kayıt silindi");
    }

    @Override
    public void updateProfile(User user) {
        UserCheckOperation(user, "kayıt güncellendi.");
    }

    private void UserCheckOperation(User user, String message){
        if(_userCheckService.checkIfRealPerson(user)) {
            System.out.println(user.getFirstName() + " " + message);
        }else{
            System.out.println("Not a valid person");
        }
    }
}
