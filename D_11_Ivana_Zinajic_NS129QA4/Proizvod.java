package D_11_Ivana_Zinajic_NS129QA4;

public abstract class Proizvod {
    private String barKod;
    private String naziv;
    private double cena;
    private double cenaSaPopustom;

    public Proizvod(String barKod, String naziv, double cena) {
        this.barKod = barKod;
        this.naziv = naziv;
        this.cena = cena;
        this.cenaSaPopustom = cena;
        if (cena > 200) {
            this.cenaSaPopustom = cena - cena * 15 / 100;
        }
    }


    public String getBarKod() {
        return barKod;
    }

    public void setBarKod(String barKod) {
        this.barKod = barKod;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public double getCena() {
        return cena;
    }

    public double getCenaSaPopustom() {
        return cenaSaPopustom;
    }

    public void setCenaSaPopustom(double cenaSaPopustom) {
        this.cenaSaPopustom = cena;
    }

    public abstract double setPopust();

    public abstract void order(int kolicina);

    @Override
    public abstract String toString();

}

