package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="hencmen")
public class Henchman extends Adventurer{
    private int salary;  //henchmen get basic salary for every quest they attend

    private Hero hero;

    public Henchman(String name, int hp, Weapon weapon, int salary) {
        super(name, hp, weapon);
        this.salary=salary;

    }
    public Henchman(){}

    @Column(name="salary")
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

}
