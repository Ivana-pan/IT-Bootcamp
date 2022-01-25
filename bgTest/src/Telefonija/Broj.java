package Telefonija;

import com.sun.deploy.security.SelectableSecurityManager;

public class Broj {
    /*tekstualni kod drzave (npr 381 je za srbiju) (String)
            - pozivni broj (npr 63) (String)
            - broj (npr 1234567) (String)
            - fiksniBroj (boolean) - ima vrednost true ako je broj fiksni, a false ako je broj mobilni*/

        private String kodDrzave;
        private String pozivniBroj;
        private String broj;
        private boolean fiksniBroj;

        /*- konstruktor (sva polja su obavezna)
	- getter i setter metode*/


    public Broj(String kodDrzave, String pozivniBroj, String broj, boolean fiksniBroj) {
        this.kodDrzave = kodDrzave;
        this.pozivniBroj = pozivniBroj;
        this.broj = broj;
        this.fiksniBroj = fiksniBroj;

    }

    public String getKodDrzave() {
        return kodDrzave;
    }

    public void setKodDrzave(String kodDrzave) {
        this.kodDrzave = kodDrzave;
    }

    public String getPozivniBroj() {
        return pozivniBroj;
    }

    public void setPozivniBroj(String pozivniBroj) {
        this.pozivniBroj = pozivniBroj;
    }

    public String getBroj() {
        return broj;
    }

    public void setBroj(String broj) {
        this.broj = broj;
    }

    public boolean isFiksniBroj() {
        return fiksniBroj;
    }

    public void setFiksniBroj(boolean fiksniBroj) {
        this.fiksniBroj = fiksniBroj;
    }

    /*- napisati toString metodu, format je:
            +kodDrzave pozivniBroj broj
    na primer
		+381 63 1234567*/

    public String toString(){
        return this.kodDrzave +" "+ this.pozivniBroj +" "+ this.broj;
    }

    //napisati privatnu staticku metodu proveriDaLiStringSadrziSamoNumerike, koja prima string, a vraca boolean,
    // i koja proverava da li prosledjeni string sadrzi samo numerike (brojeve).
    /*Dakle ja prvo treba da uvedem neku pretpostavku, npr da string zaista sadrzi samo numerike
    Onda treba da vidim kolika je duzina stringa.
    Onda trebam da u petlji idem i dohvatam jedan po jedan karatker iz stringa sve dok ne dodjem do kraja
            (Klasa String ima metodu charAt koja vraca karatker na prosledjenoj poziciji, npr str.charAt(2) ce dohvatit karakter na 3 poziciji,
    zasto 3.? zar nije 2.?, ne nije, brojanje krece od 0) i proveravam da li je numerik (klasa Character ima staticku metodu isDigit,
                                                                                         koja proverava da li je prosledjeni karakter numerik, dakle vraca true ako jeste, false ako nije)
    ako naidjem na neki koji nije numerik onda kazem da je moja pocetna pretpostavka losa i brejkam iz petlje
    Primer:
    String str = "Zoran2";
    char promenljivaA = str.charAt(2); // promenljivaA ce postati 'r'
    boolean jesteNumerik =  Character.isDigit(promenljivaA); // jesteNumerik ce postati false zato sto 'r' nije numerik
    char promenljivaB = str.charAt(5); // promenljivaA ce postati '2'
    jesteNumerik =  Character.isDigit(promenljivaB); // jesteNumerik ce postati true zato sto '2' jeste numerik*/



    private static boolean proveriDaLiStringSadrziSamoNumerike(String brojTelefona) {
        boolean jesteNumerik = true;
        for (int i=0; i<brojTelefona.length();i++){
            if(!Character.isDigit(brojTelefona.charAt(i))){
                jesteNumerik = false;
                break;
            }
        }
        return jesteNumerik;
    }
    /*napisati privatnu staticku metodu proveriBroj koja prima kod drzave, pozivni broj i broj i proverava da li su validni.
            - Kod drzave ne sme biti null i
		- mora sadrzati tacno 3 karaktera (odnosno biti duzine 3),
		- svi karakteri u kodu drzave moraju biti numerici (za ovu proveru pozvati prethodno napisanu staticku metodu proveriDaLiStringSadrziSamoNumerike)
		- Pozivni broj ne sme biti null i
		- mora sadrzati tacno 2 karaktera (odnosno biti duzine 2), i
	 	- svi karakteri u pozivnom broju moraju biti numerici. (za ovu proveru pozvati prethodno napisanu staticku metodu proveriDaLiStringSadrziSamoNumerike)
            - Broj ne sme biti null i
		- mora sadrzati 7 ili 8 karaktera, i
		- svi karakteri u broju moraju biti numerici.  (za ovu proveru pozvati prethodno napisanu staticku metodu
    proveriDaLiStringSadrziSamoNumerike)

    Metoda vraca vrednost tipa boolean (true ako su SVI gore navedeni uslovi zadovoljeni, false ako BAREM JEDAN nije)
	- u konstruktoru i setter metodama u slucaju da je neka vrednost nevalidna:
            - ispisati poruku o gresci ili
		- baciti ArithmeticException izuzetak (+5 poena)*/

    private static boolean proveriBroj(String kod, String pozivni, String brojFona){
        boolean proveraKoda = kod != null && kod.length() == 3 && proveriDaLiStringSadrziSamoNumerike(kod);
        boolean proveraPozivni = pozivni != null && pozivni.length() == 2 && proveriDaLiStringSadrziSamoNumerike(pozivni);
        boolean proveraBrojaFona = brojFona!=null && (brojFona.length() ==7 || brojFona.length()==8) && proveriDaLiStringSadrziSamoNumerike(brojFona);

        return true;
    }

}
