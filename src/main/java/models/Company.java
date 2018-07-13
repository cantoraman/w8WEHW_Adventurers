package models;

public class Company {
    private int treasury; //where we pay the adventurers, and add excess quest loot into
    private Hero hero;

    public Company(int treasury) {
        this.treasury = treasury;
    }


    public int getTreasury() {
        return treasury;
    }
    public void setTreasury(int treasury) {
        this.treasury = treasury;
    }

    public Hero getHero() {
        return hero;
    }
    public void setHero(Hero hero) {
        this.hero = hero;
    }
}
