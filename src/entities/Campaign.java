package entities;

import abstracrs.Entity;

import java.time.LocalDate;

public class Campaign implements Entity {
    private int id;
    private String campaignName;
    private LocalDate campaignExpirationDate;

    public Campaign(){

    }

    public Campaign(int id, String campaignName, LocalDate campaignExpirationDate){
        this();
        this.setId(id);
        this.setCampaignName(campaignName);
        this.setCampaignExpirationDate(campaignExpirationDate);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCampaignName() {
        return campaignName;
    }

    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }

    public LocalDate getCampaignExpirationDate() {
        return campaignExpirationDate;
    }

    public void setCampaignExpirationDate(LocalDate campaignExpirationDate) {
        this.campaignExpirationDate = campaignExpirationDate;
    }
}
