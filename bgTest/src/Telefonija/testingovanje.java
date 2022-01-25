package Telefonija;

public class testingovanje{

    public static void main(String[] args) {
        Broj brojJedan = new Broj("+381","064","4567894",false);
        Broj brojDva = new Broj("381","062","345987",false);

        Korisnik korisnikJedan = new Korisnik("Ivana","Zinajic",brojJedan);
        Korisnik korisnikDva = new Korisnik("Nemanja","Zdravkovic",brojDva);

        // zatim korinisci jedan drugom treba da salju neke poruke i obavljaju neke pozive (min 3 poruke i 2 poziva)
        //	- zatim treba ispisati oba korisnika
        //	- zatim treba ispisati kolika je cena svih usluga za svakog korisnika.

        korisnikJedan.posaljiPoruku(brojDva,"Cao, Nemanja! :)");
        korisnikJedan.posaljiPoruku(brojDva,"Uspeli smo! :)");
        korisnikJedan.posaljiPoruku(brojDva,"Bravo mi!");
        korisnikDva.posaljiPoruku(brojJedan,"Jel radi?");

        korisnikDva.pozovi(brojJedan,345);
        korisnikJedan.pozovi(brojDva,576);

        System.out.println(korisnikJedan.toString());
        System.out.println(korisnikDva.toString());

        System.out.println(korisnikJedan.cenaSvihUsluga());
        System.out.println(korisnikDva.cenaSvihUsluga());


    }
}
