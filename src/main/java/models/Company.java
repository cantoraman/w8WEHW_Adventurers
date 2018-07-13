package models;

public class Company {
    private int id;
    private String title;
    private int treasury; //where we pay the adventurers, and add excess quest loot into
    private Hero hero;

    public Company(String title, int treasury) {
        this.title =title;
        this.treasury = treasury;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
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
