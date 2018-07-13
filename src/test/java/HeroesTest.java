import models.Company;
import models.Hero;
import models.Quest;
import models.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HeroesTest {

    public Quest quest;
    public Company company;
    public Hero hero1;
    public Hero hero2;

    @Before
    public void setup(){
        quest = new Quest("Kill the Rat King", 1000, 500);
        company = new Company("Golden Company", 10000);
        hero1 = new Hero("Aegon Targaryen", 110, Weapon.SWORD, 0.2, company);
        hero2 = new Hero("Rhaegar Targaryen", 130, Weapon.SWORD, 0.3, company);
    }


    @Test
    public void hasName(){
        assertEquals("Aegon Targaryen", hero1.getName());
    }

    @Test
    public void hasHP(){ assertEquals(110, hero1.getHp());}

    @Test
    public void hasWeapon(){ assertEquals(Weapon.SWORD, hero1.getWeapon());}

    @Test
    public void hasRoyaltyRate(){ assertEquals(0.3, hero2.getRoyaltyRate(), 0);}

    @Test
    public void hasCompany(){ assertEquals("Golden Company", hero2.getCompany().getTitle());}

    @Test
    public void hasExperience(){ assertEquals(0, hero1.getExperience());}

    @Test
    public void hasLevel(){assertEquals(0, hero1.getLevel());}

    @Test
    public void hasPurse(){assertEquals(0, hero1.getPurse());}



}
