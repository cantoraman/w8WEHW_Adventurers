package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="companies")
public class Company {
    private int id;
    private String title;
    private int treasury; //where we pay the adventurers, and add excess quest loot into
    private Hero hero;

    public Company(String title, int treasury) {
        this.title =title;
        this.treasury = treasury;
    }

    @Column(name="title")
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name="treasury")
    public int getTreasury() {
        return treasury;
    }
    public void setTreasury(int treasury) {
        this.treasury = treasury;
    }

    //?
    public Hero getHero() {
        return hero;
    }
    public void setHero(Hero hero) {
        this.hero = hero;
    }
}
