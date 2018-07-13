package models;

public abstract class Adventurer {

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

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getExperience() {
        return experience;
    }
    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }

    public Weapon getWeapon() {
        return weapon;
    }
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public int getPurse() {
        return purse;
    }
    public void setPurse(int purse) {
        this.purse = purse;
    }
}
