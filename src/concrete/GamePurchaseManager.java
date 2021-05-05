package concrete;

import abstracrs.GamePurchaseService;
import entities.User;

public class GamePurchaseManager implements GamePurchaseService {
    @Override
    public void buyGame(User user) {
        System.out.println("Tebrikler! " + user.getFirstName() + " oyunumuzu satın aldınız. Harika seçim!");
    }
}
