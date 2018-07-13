package models;

import java.util.List;

public class Quest {
    private String name;
    private int awardTreasure;
    private int awardExperience;
    private List<Hero> heroes;


    public Quest(String name, int awardTreasure, int awardExperience) {
        this.name = name;
        this.awardTreasure = awardTreasure;
        this.awardExperience = awardExperience;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAwardExperience() {
        return awardExperience;
    }
    public void setAwardExperience(int awardExperience) {
        this.awardExperience = awardExperience;
    }

    public int getAwardTreasure() {
        return awardTreasure;
    }
    public void setAwardTreasure(int awardTreasure) {
        this.awardTreasure = awardTreasure;
    }

    public List<Hero> getHeroes() {
        return heroes;
    }
    public void setHeroes(List<Hero> heroes) {
        this.heroes = heroes;
    }
}
