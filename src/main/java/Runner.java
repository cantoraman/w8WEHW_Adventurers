import db.DBHelper;
import models.*;

public class Runner {


    public static void main(String[] args) {

        Quest quest1 = new Quest("Kill the Rat King", 1000, 500);
        DBHelper.save(quest1);
        Quest quest2 = new Quest("Clean The Spider Forest", 2000, 800);
        DBHelper.save(quest2);
        Quest quest3 = new Quest("Purge The Black Dungeon", 3000, 1000);
        DBHelper.save(quest3);
        Quest quest4 = new Quest("Raid The Dragon's Lair", 8000, 2000);
        DBHelper.save(quest4);


        Company company1 = new Company("Golden Company", 10000);
        DBHelper.save(company1);
        Company company2 = new Company("Iron Shields", 5000);
        DBHelper.save(company2);

        Hero hero1 = new Hero("Aegon Targaryen", 110, Weapon.SWORD, 0.2, company1);
        DBHelper.save(hero1);
        Hero hero2 = new Hero("Rhaegar Targaryen", 130, Weapon.AXE, 0.3, company2);
        DBHelper.save(hero2);


        Henchman hm1 = new Henchman("Volkov", 60, Weapon.BOW, 200);
        hm1.setHero(hero1);
        DBHelper.save(hm1);
        Henchman hm2 = new Henchman("Tristan", 80, Weapon.SWORD, 300);
        hm2.setHero(hero1);
        DBHelper.save(hm2);
        Henchman hm3 = new Henchman("Locras", 40, Weapon.AXE, 100);
        hm3.setHero(hero1);
        DBHelper.save(hm3);
        Henchman hm4 = new Henchman("Drake", 100, Weapon.AXE, 350);
        hm4.setHero(hero2);
        DBHelper.save(hm4);
        Henchman hm5 = new Henchman("Ivan", 90, Weapon.BOW, 90);
        hm5.setHero(hero2);
        DBHelper.save(hm5);
        Henchman hm6 = new Henchman("Jade", 50, Weapon.BOW, 100);
        hm6.setHero(hero2);
        DBHelper.save(hm6);





        System.exit(0);
    }







}
