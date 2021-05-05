package concrete;

import abstracrs.CampaignService;
import entities.Campaign;
import entities.User;

public class CampaignManager implements CampaignService {

    @Override
    public void createCampaign(Campaign campaign) {
        System.out.println(campaign.getCampaignName() + "'sı oluşturuldu");
    }

    @Override
    public void endCampaign(Campaign campaign) {
        System.out.println(campaign.getCampaignName() + "'sı sonlandırılmıştır");
    }

    @Override
    public void updateCampaign(Campaign campaign) {
        System.out.println(campaign.getCampaignName() + "'sı güncellendi");
    }


}
