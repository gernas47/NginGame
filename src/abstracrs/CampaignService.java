package abstracrs;

import entities.Campaign;
import entities.User;

public interface CampaignService {
    void createCampaign(Campaign campaign);
    void endCampaign(Campaign campaign);
    void updateCampaign(Campaign campaign);
}
