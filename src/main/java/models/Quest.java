package models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="quests")
public class Quest {

    private int id;
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


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    @Column(name="name")
    public String getName() {
        return title;
    }
    public void setName(String name) {
        this.title = name;
    }

    @Column(name="award_experience")
    public int getAwardExperience() {
        return awardExperience;
    }
    public void setAwardExperience(int awardExperience) {
        this.awardExperience = awardExperience;
    }

    @Column(name="award_treasure")
    public int getAwardTreasure() {
        return awardTreasure;
    }
    public void setAwardTreasure(int awardTreasure) {
        this.awardTreasure = awardTreasure;
    }


    @JoinTable(name = "heroes_quests",
            joinColumns = {@JoinColumn(name = "quest_id", nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn(name = "hero_id", nullable = false, updatable = false)})
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
