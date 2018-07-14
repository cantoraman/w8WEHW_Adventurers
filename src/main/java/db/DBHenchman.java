package db;

import models.Henchman;
import models.Hero;
import models.Quest;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class DBHenchman {


    private static Session session;
    private static Transaction transaction;

    public static List<Quest> getQuestsFromHenchman(Henchman hm){
        List<Quest> quests = null;

        session = HibernateUtil.getSessionFactory().openSession();

//
//        SELECT * FROM Quests INNER JOIN heroes ON heroes.id = hm.getHero().get.id
 //       SELECT * FROM Quests INNER JOIN heroes ON heroes.id = 1
        try{
            Criteria cr = session.createCriteria(Quest.class);
            cr.createAlias("heroes", "heroes");
            cr.add(Restrictions.eq("heroes.id", hm.getHero().getId()));
            quests = cr.list();
        }
        catch(HibernateException e){
            e.printStackTrace();
        }finally {
            session.close();
        }
        return quests;
    }








}
