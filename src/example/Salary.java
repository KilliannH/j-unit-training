package example;

class Salary {

    private double brutTotal;

    private double socialContrib_salaryMargin = 3300d;
    private double socialContribRate_1 = 0.0915d;
    private double socialContribRate_2 = 0.0690f;

    private double pensionContrib_salaryMargin = 3200d;
    private double pensionContribRate_1 = 0.039d;
    private double pensionContribRate_2 = 0.090d;

    public Salary() { }

    public double getBrutTotal() {
        return brutTotal;
    }

    public void setBrutTotal(double brutTotal) {
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

        // System.out.println("social amounts " + (double)Math.round((contribAmount_1 + contribAmount_2) * 100d) / 100d + "€");
     return (double)Math.round((contribAmount_1 + contribAmount_2) * 100d) / 100d;
    }

    public double calculPensionContribs() {
        double pensionContribAmount;

        if (brutTotal < pensionContrib_salaryMargin) {
            pensionContribAmount = pensionContribRate_1 * brutTotal;
        } else {
            pensionContribAmount = pensionContribRate_2 * brutTotal;
        }

        // System.out.println("pension amount " + (double)Math.round(pensionContribAmount * 100d) / 100d + "€");
        return (double)Math.round(pensionContribAmount * 100d) / 100d;
    }

    public double getNetTotal() {
        double socialContribs = calculSocialContribs();
        double pensionContribs = calculPensionContribs();

        // System.out.println("NET " + (double)Math.round((brutTotal - (socialContribs + pensionContribs)) * 100d) / 100d + "€");
        return (double)Math.round((brutTotal - (socialContribs + pensionContribs)) * 100d) / 100d;
    }
}
