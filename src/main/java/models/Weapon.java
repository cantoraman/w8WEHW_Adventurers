package models;

public enum Weapon {
    SWORD(10),
    AXE(20),
    BOW(5);
    private int damage;
    Weapon(int dmg) {
        this.damage = dmg;
    }
    public int getDamage(){
        return this.damage;
    }
}
