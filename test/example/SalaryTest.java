package example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalaryTest {

    @Test
    void calculSocialContribs() {
        // nominal case
        Salary salary = new Salary(4000);
        assertEquals(593.7d, salary.calculSocialContribs());
    }

    @Test
    void calculPensionContribs() {
        // nominal case
        Salary salary = new Salary(4000);
        assertEquals(360.0d, salary.calculPensionContribs());
    }

    @Test
    void getNetTotal() {
        // nominal case
        Salary salary = new Salary(4000);
        double totalBrut = 4000;
        double socialContribs = salary.calculSocialContribs();
        double pensionContribs = salary.calculPensionContribs();
        assertEquals(totalBrut - (socialContribs + pensionContribs), salary.getNetTotal());
    }
}