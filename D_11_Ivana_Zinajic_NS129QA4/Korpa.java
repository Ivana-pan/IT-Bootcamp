package D_11_Ivana_Zinajic_NS129QA4;

import java.util.HashMap;
import java.util.Map;

public class Korpa {
    private Kupac kupac;
    private Map<Proizvod, Integer> kolicinaKupljenihProizvoda;

    public Korpa(Kupac kupac) {
        this.kupac = kupac;
        this.kolicinaKupljenihProizvoda = new HashMap<>();
    }

    public Kupac getKupac() {
        return kupac;
    }

    public void setKupac(Kupac kupac) {
        this.kupac = kupac;
    }

    public Map<Proizvod, Integer> getKolicinaKupljenihProizvoda() {
        return kolicinaKupljenihProizvoda;
    }

    public void addProizvod(Proizvod proizvod) {
        if (kolicinaKupljenihProizvoda.containsKey(proizvod)) {
            kolicinaKupljenihProizvoda.put(proizvod, kolicinaKupljenihProizvoda.get(proizvod) + 1);
        } else {
            kolicinaKupljenihProizvoda.put(proizvod, 1);
        }
    }

    public void ispisiRacun() {
        double racun = 0;
        for (Proizvod proizvodUKorpi : this.kolicinaKupljenihProizvoda.keySet()) {
            System.out.print(proizvodUKorpi.getNaziv() + " ");
            System.out.print("x" + this.kolicinaKupljenihProizvoda.get(proizvodUKorpi));
            double ukupnaCena = proizvodUKorpi.getCenaSaPopustom() * this.kolicinaKupljenihProizvoda.get(proizvodUKorpi);
            System.out.print(" " + ukupnaCena);
            System.out.println();
            racun += ukupnaCena;
        }
        System.out.println();
        System.out.println("Za uplatu " + racun);
    }
}
