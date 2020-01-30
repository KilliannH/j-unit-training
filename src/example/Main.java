package example;

public class Main {
    public static void main(String[] args) {
        Salary salary = new Salary(4000);
        salary.calculSocialContribs();
        salary.calculPensionContribs();
        salary.getNetTotal();
    }
}
