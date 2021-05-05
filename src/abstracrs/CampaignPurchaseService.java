package abstracrs;

import entities.Campaign;
import entities.User;

public interface CampaignPurchaseService {
    void buyCampaign(User user, Campaign campaign);
}
