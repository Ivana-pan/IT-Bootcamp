package Telefonija;

abstract class Usluga {
    private Broj brojOd;
    private Broj brojKa;

    public Usluga(Broj brojOd, Broj brojKa) {
        this.brojOd = brojOd;
        this.brojKa = brojKa;
    }

    public Broj getBrojOd() {
        return brojOd;
    }

    public Broj getBrojKa() {
        return brojKa;
    }

    /*toString metodu, format je
		- brojOd -> brojKa
            npr
		+381 63 1234567 -> +381 62 234123*/

		@Override
        public String toString(){
            return brojOd + " -> " + brojKa;
        }

    /*- apstraktnu metodu cenaUsluge koja vraca vrednost tipa double*/

    abstract double cenaUsluge();
}
