package concrete;

import abstracrs.CampaignPurchaseService;
import entities.Campaign;
import entities.User;

public class CampaignPurchaseManager implements CampaignPurchaseService {

    @Override
    public void buyCampaign(User user, Campaign campaign) {
        System.out.println("Tebrikler! " + user.getFirstName() + " " + campaign.getCampaignName() + "'na katıldınız." );
    }
}
