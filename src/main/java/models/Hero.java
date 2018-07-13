package models;

import java.util.List;

public class Hero extends Adventurer{

    private double royaltyRate; //hero gets a royalty from each quest as a percentage

    private Company company;

    private List<Quest> quests;


    public Hero(String name, int hp, Weapon weapon, double royaltyRate, Company company) {
        super(name, hp, weapon);
        this.royaltyRate = royaltyRate;
        this.company = company;
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
}
