package models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="heroes")
public class Hero extends Adventurer{

    private double royaltyRate; //hero gets a royalty from each quest as a percentage
    private Company company;
    private List<Quest> quests;
    private List<Henchman> henchmen;

    public Hero(String name, int hp, Weapon weapon, double royaltyRate, Company company) {
        super(name, hp, weapon);
        this.royaltyRate = royaltyRate;
        this.company = company;
        quests = new ArrayList<Quest>();
        henchmen = new ArrayList<Henchman>();
    }

    public Hero(){}

    @Column(name="royalty_rate")
    public double getRoyaltyRate() {
        return royaltyRate;
    }
    public void setRoyaltyRate(double royaltyRate) {
        this.royaltyRate = royaltyRate;
    }

    @OneToOne
    @JoinColumn(name = "company_id", nullable = false)
    public Company getCompany() {
        return company;
    }
    public void setCompany(Company company) {
        this.company = company;
    }

    //
    //Henchmen
    @OneToMany(mappedBy = "hero", fetch = FetchType.LAZY)
    public List<Henchman> getHenchmen() {
        return henchmen;
    }
    public void setHenchmen(List<Henchman> henchmen) {
        this.henchmen = henchmen;
    }

    public void addHenchman(Henchman henchman){
        henchmen.add(henchman);
    }
    public void removeHenchman(Henchman henchman){
        henchmen.remove(henchman);
    }

    //
    //Quests
    public List<Quest> getQuests() {
        return quests;
    }
    public void setQuests(List<Quest> quests) {
        this.quests = quests;
    }

    public void addQuest(Quest quest){
        quests.add(quest);
    } public void removeQuest(Quest quest){
        quests.remove(quest);
    }
    //
}
