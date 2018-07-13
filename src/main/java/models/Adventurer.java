package models;

import javax.persistence.*;

@Entity
@Table(name = "adventurers")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Adventurer {

    private int id;
    private String name;
    private int hp;
    private int experience;
    private int level;
    private Weapon weapon;
    private int purse;

    public Adventurer(String name, int hp, Weapon weapon){
        this.name = name;
        this.hp = hp;
        this.experience = 0;
        this.level = 0;
        this.weapon = weapon;
        this.purse = 0;
    }

    public Adventurer(){}

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
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Column(name="hp")
    public int getHp() {
        return hp;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }

    @Column(name="experience")
    public int getExperience() {
        return experience;
    }
    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void addExperience(int amount){
        this.experience+=amount;
    }

    @Column(name="level")
    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }

    public void assignLevel(){
       if(experience<1000)
                level=1;
       if (experience>1000 && experience<2000)
                level=2;
       if (experience>2000 && experience<3000)
                level=3;
       if (experience>3000)
                level=4;
    }

    @Enumerated(value = EnumType.STRING)
    public Weapon getWeapon() {
        return weapon;
    }
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    @Column(name="purse")
    public int getPurse() {
        return purse;
    }
    public void setPurse(int purse) {
        this.purse = purse;
    }

    public void addTreasure(int amount){
       this.purse += amount;
    }
}
