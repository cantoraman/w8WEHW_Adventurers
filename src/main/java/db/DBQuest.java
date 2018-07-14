package db;

import models.Henchman;
import models.Hero;
import models.Quest;
import models.Weapon;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DBQuest {


    private static Session session;
    private static Transaction transaction;


    public static Weapon getMostWidelyUsedWeaponFromQuest(Quest quest){
        Weapon weapon = null;
        List<Weapon> weapons = new ArrayList<Weapon>();
        List<Hero> heroes = null;
        session = HibernateUtil.getSessionFactory().openSession();
// get all weapons from quest
// to do that: get all heroes from quest

        try {
            Criteria cr = session.createCriteria(Hero.class);
            cr.createAlias("quests", "quest");
            cr.add(Restrictions.eq("quest.id", quest.getId()));
            heroes = cr.list();

            for (Hero hero : heroes){
                weapons.add(hero.getWeapon());
                List<Henchman> henchmen = hero.getHenchmen();
                for (Henchman henchman: henchmen)
                    weapons.add(henchman.getWeapon());
            }


        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }

        HashMap<Weapon, Integer> popularWeapons = new HashMap<Weapon, Integer>();
        for(Weapon weapon1: weapons){
                if(popularWeapons.containsKey(weapon1))
                    popularWeapons.put(weapon1, popularWeapons.get(weapon1)+1);
                else
                    popularWeapons.put(weapon1, 1);
        }


        int amount = 0;
        for(Weapon weapon2 : popularWeapons.keySet())
        {
            if(popularWeapons.get(weapon2)>amount) {
                weapon = weapon2;
                amount = popularWeapons.get(weapon2);
            }
        }

        return weapon;
    }

}
