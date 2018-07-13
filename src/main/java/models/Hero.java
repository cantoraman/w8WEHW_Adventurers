package models;

import java.util.List;

public class Hero extends Adventurer{

    private int royaltyRate; //hero gets a royalty from each quest as a percentage

    private Company company;

    private List<Quest> quests;


    public Hero(String name, int hp, Weapon weapon, int royaltyRate) {
        super(name, hp, weapon);
        this.royaltyRate = royaltyRate;
    }


    public int getRoyaltyRate() {
        return royaltyRate;
    }
    public void setRoyaltyRate(int royaltyRate) {
        this.royaltyRate = royaltyRate;
    }
}
