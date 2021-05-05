package abstracrs;

import entities.User;

public interface PurchaseService {
    void buy(User user, Product product);
}
