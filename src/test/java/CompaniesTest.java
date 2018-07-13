import models.Company;
import models.Hero;
import models.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CompaniesTest {

    public Company company;
    public Hero hero;

    @Before
    public void setup(){
        company = new Company("Golden Company", 10000);
        hero = new Hero("Aegon Targaryen", 110, Weapon.SWORD, 0.2, company);
    }

    @Test
    public void hasName(){
        assertEquals("Golden Company", company.getTitle());
    }

    @Test
    public void hasTreasure(){
        assertEquals(10000, company.getTreasury());
    }

    @Test
    public void hasHero(){
        company.setHero(hero);
        assertEquals("Aegon Targaryen", company.getHero().getName());
    }
}

