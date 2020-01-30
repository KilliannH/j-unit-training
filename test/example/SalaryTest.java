package example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalaryTest {

    static private Salary salary;

    @BeforeAll
    static public void init() {
        salary = new Salary();
        salary.setBrutTotal(4000);
    }

    @Test
    void calculSocialContribs() {
        // nominal case
        assertEquals(593.7d, salary.calculSocialContribs());
    }

    @Test
    void calculPensionContribs() {
        // nominal case
        assertEquals(360.0d, salary.calculPensionContribs());
    }

    @Test
    void getNetTotal() {
        // nominal case
        double totalBrut = salary.getNetTotal();
        double socialContribs = salary.calculSocialContribs();
        double pensionContribs = salary.calculPensionContribs();
        assertEquals(totalBrut - (socialContribs + pensionContribs), salary.getNetTotal());
    }
}