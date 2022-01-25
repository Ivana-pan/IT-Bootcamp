package Telefonija;

public class Poruke extends Usluga{
    private String tekstPoruke;

    public Poruke(Broj brojOd, Broj brojKa, String tekstPoruke) {
        super(brojOd, brojKa);
        this.tekstPoruke = tekstPoruke;
    }

    public String getTekstPoruke() {
        return tekstPoruke;
    }

    public void setTekstPoruke(String tekstPoruke) {
        this.tekstPoruke = tekstPoruke;
    }
    //toString metodu, format je
    //		brojOd -> brojKa tekstPoruke
    //		npr
    //		+381 63 1234567 -> +381 62 234123 Cao :).

    @Override
    public String toString(){
        return getBrojOd() + " -> " + getBrojKa() + " \n" + tekstPoruke +" \n \n";
    }
    //Cena poruke ukoliko ju je moguce poslati je 3 dinara, ukoliko je nije moguce poslati cena je 0 dinara.
    //	Poruku je moguce poslati ako
    //		- brojOd nije jednak null
    //		- brojKa nije jednak null i
    //		- brojOd i brojKa nisu jednaki medjusobno i
    //		- brojOd nije fiksni broj i
    //		- brojKa nije fiksni broj
    @Override
    double cenaUsluge() {

        return (getBrojOd()!=null && getBrojKa()!=null && getBrojKa()!=getBrojOd() && !getBrojOd().isFiksniBroj() && !getBrojKa().isFiksniBroj()) ? 3 : 0;

    }
}
