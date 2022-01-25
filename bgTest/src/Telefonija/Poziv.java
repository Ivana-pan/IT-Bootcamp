package Telefonija;

public class Poziv extends Usluga {
    private int trajanjeUSekundama;

    public Poziv(Broj brojOd, Broj brojKa, int trajanjeUSekundama) {
        super(brojOd, brojKa);
        this.trajanjeUSekundama = trajanjeUSekundama;

    }

    public int getTrajanjeUSekundama() {
        return trajanjeUSekundama;
    }

    public void setTrajanjeUSekundama(int trajanjeUSekundama) {
        this.trajanjeUSekundama = trajanjeUSekundama;
    }
    //brojOd -> brojKa <trajanje u formatu minuti:sekunde>
    //		npr
    //		+381 63 1234567 -> +381 62 234123 2:31
    @Override
    public String toString(){
        return getBrojOd() + " -> " + getBrojKa() +" "+ trajanjeUSekundama/60 + ":" +trajanjeUSekundama%60;
    }
    //nadjacati metodu cena usluge. Metoda vraca kolika je cena razgovora koji je inicirao brojOd ka brojKa.
    //	Cena razgovora ukoliko ga je moguce obaviti je 10 dinara za svaki zapoceti minut
    //	(npr ako je trajanje u sekundama 122, to je 2 minuta i 2 sekunde, odnosno 2 cela minuta i zapocet treci, cena je 3*10=30 dinara).
    //	Ukoliko nije moguce obaviti poziv cena je 0 dinara.
    //	Poziv je moguce obaviti ako
    //		- brojOd nije jednak null
    //		- brojKa nije jednak null i
    //		- brojOd i brojKa nisu jednaki medjusobno
    @Override
    double cenaUsluge(){
        return(getBrojKa()!=null && getBrojOd()!=null && getBrojOd()!=getBrojKa())? Math.ceil(trajanjeUSekundama*1.0/60)*10 : 0;
    }
}


