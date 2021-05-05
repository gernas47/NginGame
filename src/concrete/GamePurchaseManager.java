package concrete;


import abstracrs.Product;
import abstracrs.PurchaseService;
import entities.User;

public class GamePurchaseManager implements PurchaseService {

    @Override
    public void buy(User user, Product product) {
        System.out.println("Tebrikler! " + user.getFirstName() + " ürünü başarılı bir şekilde satın aldınız.");
    }
}
