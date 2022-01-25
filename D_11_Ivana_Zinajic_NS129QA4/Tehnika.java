package D_11_Ivana_Zinajic_NS129QA4;

public class Tehnika extends Proizvod {
    private String garancija;
    private int tezina;

    public Tehnika(String barKod, String naziv, double cena, int tezina) {
        super(barKod, naziv, cena);
        this.tezina = tezina;
        if (tezina>30){
            System.out.println("Dostava do vrata");
        }
    }

    public String getGarancija() {
        return garancija;
    }

    public void setGarancija(String garancija) {
        this.garancija = garancija;
    }

    public int getTezina() {
        return tezina;
    }

    public void setTezina(int tezina) {
        this.tezina = tezina;
    }

    @Override
    public double setPopust() {
        return 0;
    }

    @Override
    public void order(int kolicina) {

        double cenaSaPopustom = super.getCena();
        double racun = 0;

        if (super.getCena() > 200) {
            racun = cenaSaPopustom -= getCena() * 15 / 100;
        } else {
            racun = getCena() * kolicina;
        }
        System.out.println("Vas racun iznosi " + racun + " RSD");
    }

    @Override
    public String toString() {
        return "Naziv " + getNaziv() + "\n" + "cena " + getCena() + " tezina " + getTezina() + " garancija " + getGarancija();
    }

}

