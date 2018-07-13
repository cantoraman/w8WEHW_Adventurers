package models;

import java.util.ArrayList;
import java.util.List;

public class Quest {
    private String title;
    private int awardTreasure;
    private int awardExperience;
    private List<Hero> heroes;


    public Quest(String title, int awardTreasure, int awardExperience) {
        this.title = title;
        this.awardTreasure = awardTreasure;
        this.awardExperience = awardExperience;
        heroes = new ArrayList<Hero>();
    }

    public String getName() {
        return title;
    }
    public void setName(String name) {
        this.title = name;
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



    public void addHero(Hero hero){
        heroes.add(hero);
    }
    public void removeHero(Hero hero){
        heroes.remove(hero);
    }


}
