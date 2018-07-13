package models;

import java.util.ArrayList;
import java.util.List;

public class Hero extends Adventurer{

    private double royaltyRate; //hero gets a royalty from each quest as a percentage

    private Company company;

    private List<Quest> quests;
    private List<Henchman> henchmen;

    public Hero(String name, int hp, Weapon weapon, double royaltyRate, Company company) {
        super(name, hp, weapon);
        this.royaltyRate = royaltyRate;
        this.company = company;
        quests = new ArrayList<Quest>();
        henchmen = new ArrayList<Henchman>();
    }

    public Hero(){}

    public double getRoyaltyRate() {
        return royaltyRate;
    }
    public void setRoyaltyRate(double royaltyRate) {
        this.royaltyRate = royaltyRate;
    }

    public Company getCompany() {
        return company;
    }
    public void setCompany(Company company) {
        this.company = company;
    }

    public List<Henchman> getHenchmen() {
        return henchmen;
    }
    public void setHenchmen(List<Henchman> henchmen) {
        this.henchmen = henchmen;
    }

    public List<Quest> getQuests() {
        return quests;
    }
    public void setQuests(List<Quest> quests) {
        this.quests = quests;
    }
}
