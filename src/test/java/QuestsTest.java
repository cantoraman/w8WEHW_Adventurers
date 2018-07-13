import models.Company;
import models.Hero;
import models.Quest;
import models.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QuestsTest {

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
    public void hasTitle(){
        assertEquals("Kill the Rat King", quest.getName());
    }

    @Test
    public void canAwardTreasure(){
        assertEquals(1000, quest.getAwardTreasure());
    }

    @Test
    public void canAwardExperience(){
        assertEquals(500, quest.getAwardExperience());
    }

    @Test
    public void canAddHero(){
        quest.addHero(hero1);
        assertEquals(1, quest.getHeroes().size());
    }

    @Test
    public void canRemoveHero(){
        quest.addHero(hero1);
        quest.addHero(hero2);
        quest.removeHero(hero1);
        assertEquals(1, quest.getHeroes().size());
    }

}
