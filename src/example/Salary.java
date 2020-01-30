package example;

class Salary {

    private double brutTotal;

    private double socialContrib_salaryMargin = 3300d;
    private double socialContribRate_1 = 0.0915d;
    private double socialContribRate_2 = 0.0690f;

    private double pensionContrib_salaryMargin = 3200d;
    private double pensionContribRate_1 = 0.039d;
    private double pensionContribRate_2 = 0.090d;

    public Salary(int brutTotal) {
        this.brutTotal = brutTotal;
    }

    public double calculSocialContribs() {
        double contribAmount_1;
        double contribAmount_2;

        if (brutTotal > socialContrib_salaryMargin) {
            contribAmount_2 = socialContrib_salaryMargin * socialContribRate_2;
        } else {
            contribAmount_2 = brutTotal * socialContribRate_2;
        }

        contribAmount_1 = brutTotal * socialContribRate_1;

     return contribAmount_1 + contribAmount_2;
    }

    public double calculPensionContribs() {
        double pensionContribAmount;

        if (brutTotal < pensionContrib_salaryMargin) {
            pensionContribAmount = pensionContribRate_1 * brutTotal;
        } else {
            pensionContribAmount = pensionContribRate_2 * brutTotal;
        }

        return pensionContribAmount;
    }

    public double getNetTotal() {
        return calculSocialContribs() + calculPensionContribs();
    }
}
