package D_11_Ivana_Zinajic_NS129QA4;

public class Pice extends Proizvod {
    private final String[] ambalaza;
    private String izborAmbalaze;

    public Pice(String barKod, String naziv, double cena, String izborAmbalaze) {
        super(barKod, naziv, cena);
        this.ambalaza = new String[]{"kartonska", "plasticna", "staklena", "limenka"};
        this.izborAmbalaze = izborAmbalaze;


    }

    @Override
    public double setPopust() {
        return 0;
    }

    @Override
    public void order(int kolicina) {
        double[] cenaAmbalaze = cenaAmbalaze(ambalaza);
        double racun = 0;

        switch (this.izborAmbalaze) {
            case "kartonska":
                racun = (cenaAmbalaze[0] + super.getCena()) * kolicina;

            case "plasticna":
                racun = (cenaAmbalaze[1] + super.getCena()) * kolicina;

            case "staklena":
                racun = (cenaAmbalaze[2] + super.getCena()) * kolicina;

            case "limenka":
                racun = (cenaAmbalaze[3] + super.getCena()) * kolicina;
        }
        System.out.println("Vas racun je " + racun);
    }

    @Override
    public String toString() {
        return "Naziv " + getNaziv() + "\n" + "cena " + getCena() + " \n ambalaza " + izborAmbalaze;
    }


    public String[] getAMBALAZA() {
        return ambalaza;
    }

    public double[] cenaAmbalaze(String[] vrsteAmbalaze) {
        int procenat = 10;
        double[] cenaAmbalaze = new double[vrsteAmbalaze.length];
        for (int i = 0; i < vrsteAmbalaze.length; i++) {
            if (i == 3) {
                procenat = 30;
            }
            cenaAmbalaze[i] = super.getCena() * procenat / 100;
            procenat += 10;
        }
        return cenaAmbalaze;
    }


}

