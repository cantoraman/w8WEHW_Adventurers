package db;

import models.Henchman;
import models.Hero;
import models.Quest;

public class DBHero {

    public static void addHenchmanToHero(Henchman hm, Hero hero) {
        if (hm.getHero()==hero){
            hero.addHenchman(hm);
        }
        else
        {
            hm.setHero(hero);
            DBHelper.save(hm);
            hero.addHenchman(hm);
        }
        DBHelper.update(hero);

    }

    public static void setOnAQuest(Hero hero, Quest quest) {

        hero.addQuest(quest);

        int theLoot = quest.getAwardTreasure();

        hero.addTreasure((int)(theLoot*hero.getRoyaltyRate()));
        theLoot=(int)(theLoot*(1-hero.getRoyaltyRate()));
        hero.addExperience(quest.getAwardExperience());

        for(Henchman henchman : hero.getHenchmen()){
            henchman.addTreasure(henchman.getSalary());
            theLoot-=henchman.getSalary();
            henchman.addExperience(quest.getAwardExperience());
            henchman.assignLevel();
            DBHelper.update(henchman);
        }

        hero.getCompany().setTreasury(hero.getCompany().getTreasury()+theLoot);


        hero.assignLevel();
        DBHelper.update(hero);
    }
}



