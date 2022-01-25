package D_11_Ivana_Zinajic_NS129QA4;

import java.time.LocalDate;
import java.util.Scanner;

public class TestProizvoda {
    public static void main(String[] args) {
        Proizvod nob = new Prehrambeni("tk456", "Noblice", 99.99, LocalDate.of(2022, 10, 6));
        Proizvod jafa = new Prehrambeni("ut698", "Jafa", 56.99, LocalDate.of(2021, 7, 23));
        Proizvod tv = new Tehnika("gh123", "Monitor", 7000, 25);
        Proizvod rum = new AlkoholnaPica("56khl", "Zacappa", 6000, 43, "staklena");
        Proizvod jorgurt = new Pice("45kjl", "Jogurt", 100, "kartonska");
        Proizvod vino = new AlkoholnaPica("2389t", "Vino", 790.60, 14, "plasticna");

        Proizvod[] niz = new Proizvod[]{nob, jafa, tv, rum, jorgurt, vino};

        Scanner s = new Scanner(System.in);
        System.out.print("Unesite vase ime i prezime: ");
        Kupac jedan = new Kupac(s.next(), s.nextLine());
        Korpa korpaJedan = new Korpa(jedan);

        boolean kupovina = true;

        while (kupovina) {
            System.out.println("Unesite bar kod proizvoda koji zelite da dodate u korpu: ");
            String barKod = s.nextLine();
            boolean pronadjen = false;
            if (barKod.equals("x")) {
                kupovina = false;
                break;
            }
            for (Proizvod proizvod : niz) {
                if (barKod.equals(proizvod.getBarKod())) {
                    korpaJedan.addProizvod(proizvod);
                    System.out.println("Proizvod " + proizvod.getNaziv() + " je dodat u korpu.");
                    System.out.println("Za zavrsetak kupovine unesite 'x'");
                    pronadjen = true;
                }
            }
            if (!pronadjen) {
                System.out.println("Uneli ste pogresan barkod");
            }
        }
        korpaJedan.ispisiRacun();


        /*System.out.println(nob + "\n");
        System.out.println(jafa + "\n");
        System.out.println(tv + "\n");
        System.out.println(rum + "\n");
        System.out.println(vino + "\n");
        System.out.println(jorgurt + "\n");

        nob.order(1);
        jafa.order(2);
        tv.order(3);
        rum.order(2);
        vino.order(4);
        jorgurt.order(2);
*/
    }
}


