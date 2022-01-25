package D_11_Ivana_Zinajic_NS129QA4;

import java.time.LocalDate;

public class Prehrambeni extends Proizvod {
    private LocalDate datumisteka;

    public Prehrambeni(String barKod, String naziv, double cena, LocalDate datumisteka) {
        super(barKod, naziv, cena);
        this.datumisteka = datumisteka;
    }

    public LocalDate getDatumisteka() {
        return datumisteka;
    }

    public void setDatumisteka(LocalDate datumisteka) {
        this.datumisteka = datumisteka;
    }

    @Override
    public double setPopust() {
        return 0;
    }

    @Override
    public void order(int kolicina) {
        if (datumisteka.isAfter(LocalDate.now())) {
            double racun = super.getCena() * kolicina;
            System.out.println("Vas racun je " + racun + "RSD");
        } else if (datumisteka.isBefore(LocalDate.now())) {
            System.out.println("Datum istekao!!!");
        }
    }

    @Override
    public String toString() {
        return "Naziv " + getNaziv() + "\n" + "cena " + getCena();
    }


}

