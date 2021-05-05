import abstracrs.CampaignService;
import abstracrs.Product;
import abstracrs.PurchaseService;
import adapters.MernisServiceAdapter;
import concrete.CampaignManager;
import concrete.CampaignPurchaseManager;
import concrete.GamePurchaseManager;
import concrete.UserManager;
import entities.Campaign;
import entities.Game;
import entities.User;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        User gernas = new User(1, "gernas47", "gernas", "kilinc", "10000000000", LocalDate.of(1996,3,21));
        UserManager userManager = new UserManager(new MernisServiceAdapter());
        GamePurchaseManager gamePurchaseManager = new GamePurchaseManager();
        userManager.register(gernas);
        userManager.updateProfile(gernas);


        System.out.println("----------------------------");

        Campaign campaign1 = new Campaign();
        campaign1.setId(1);
        campaign1.setCampaignName("Bahar Kampanyası");
        campaign1.setCampaignExpirationDate(LocalDate.of(2021,5, 6));

        CampaignManager campaignManager = new CampaignManager();
        campaignManager.createCampaign(campaign1);
        campaignManager.updateCampaign(campaign1);

        Game nginGame = new Game();

        System.out.println("----------------------------");

        PurchaseService purchaseService1 = new GamePurchaseManager();
        PurchaseService purchaseService2 = new CampaignPurchaseManager();

        purchaseService1.buy(gernas, nginGame);
        purchaseService2.buy(gernas, campaign1);
        System.out.println("----------------------------");

        campaignManager.endCampaign(campaign1);

        System.out.println("----------------------------");

        userManager.deleteAccount(gernas);

    }
}
