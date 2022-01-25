public class Prodavnica {
    private Kafa[] kafa;
    private String adresa;
    private static int brojProdavnice = 1;
    private int pojedinacanIndex;
    private int brojKupljenihProizvoda = 0;

    public Prodavnica(Kafa[] kafa, String adresa) {
        this.kafa = kafa;
        this.adresa = adresa;
    }

    public Kafa[] getKafa() {
        return kafa;
    }

    public void setKafa(Kafa[] kafa) {
        this.kafa = kafa;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public int getBrojProdavnice() {
        return brojProdavnice;
    }

    /*public void setBrojProdavnice(int brojProdavnice) {
        Prodavnica.brojProdavnice = brojProdavnice;
    }*/

    public int getBrojKupljenihProizvoda() {
        return brojKupljenihProizvoda;
    }

    public void setBrojKupljenihProizvoda(int brojKupljenihProizvoda) {
        this.brojKupljenihProizvoda = brojKupljenihProizvoda;
    }

    public int getPojedinacanIndex() {
        return pojedinacanIndex;
    }

    //METODA KOJA AUTOINKREMENTUJE BROJ PRODAVNICA
    public int setBrojProdavnica() {
        this.pojedinacanIndex = brojProdavnice;
        brojProdavnice++;
        return pojedinacanIndex;
    }

    //METODA KOJA KUPUJE KAFU
    public void kupiKafu(Kafa kafa, int kolicina) {
        double racun = kafa.getCena() * kolicina;
        System.out.println("Vas racun za " + kolicina + " " + kafa.getNaziv() + "a je: " + racun);
        brojKupljenihProizvoda += kolicina;
    }

    //METODA KOJA OBRACUNAVA POPUST SVIH KAFA U PRODAVNICI\
    public void popustNaSveKafeUProdavnici(int procenat) {
        for (Kafa element : this.kafa) {
            element.obracunajPopust(procenat);
        }
    }
    public static Prodavnica najuspesnijaProdavnica(Prodavnica[] lanacProdavnica){
        int check = 0;
        for (int i = 1; i < lanacProdavnica.length; i++) {
            if (lanacProdavnica[i - 1].getBrojKupljenihProizvoda() < lanacProdavnica[i].getBrojKupljenihProizvoda()) {
                stampajProdavnicu(lanacProdavnica[i]);
                check = i;
            } else {
                stampajProdavnicu(lanacProdavnica[i - 1]);
                check = i - 1;
            }
        }
        return lanacProdavnica[check];
    }
    public static void stampajProdavnicu(Prodavnica prodavnica){
        System.out.println(prodavnica.brojKupljenihProizvoda  + " " + prodavnica.getAdresa() + " " + prodavnica.setBrojProdavnica());
    }

}
