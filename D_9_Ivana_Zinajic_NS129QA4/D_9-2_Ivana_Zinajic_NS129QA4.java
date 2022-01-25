public class Main_metoda_KAFA {
    public static void main(String[] args) {

        Kafa[] kafe = new Kafa[3];
        kafe[0] = new Kafa("Nes", "s", new String[]{"mleko", "secer"}, 100);
        kafe[1] = new Kafa("DolceGusto", "l", new String[]{"mleko", "secer", "voda"}, 250);
        kafe[2] = new Kafa("Amerikana", "m", new String[]{"mleko", "secer", "voda", "cokolada"}, 400);
        Kafa[] kafe2 = new Kafa[2];
        kafe2[0] = new Kafa("Hladan_Nes", "xl", new String[]{"mleko", "secer", "voda"}, 200);
        kafe2[1] = new Kafa("Amerikana", "l", new String[]{"mleko", "secer", "voda", "cokolada"}, 400);

        Prodavnica prodavnica1 = new Prodavnica(kafe, "Gagarinova");
        Prodavnica prodavnica2 = new Prodavnica(kafe2, "Puskinova");
        Prodavnica[] lanacProdavnica = new Prodavnica[2];
        lanacProdavnica[0] = prodavnica1;
        lanacProdavnica[1] = prodavnica2;


        //prodavnica1.popustNaSveKafeUProdavnici(100);
        //prodavnica2.popustNaSveKafeUProdavnici(100);
        prodavnica1.kupiKafu(kafe[0], 2);
        prodavnica2.kupiKafu(kafe2[0], 5);
        prodavnica2.kupiKafu(kafe2[1], 10);
        //System.out.println("DZABAA");


//        stampajKafu(kafe);

        Prodavnica.najuspesnijaProdavnica(lanacProdavnica).popustNaSveKafeUProdavnici(20);
        stampajKafu(kafe);
        stampajKafu(kafe2);


    }
    public static void stampajProdavnicu(Prodavnica prodavnica){
        System.out.println(prodavnica.getBrojKupljenihProizvoda() +" "+ prodavnica.getAdresa() + " " + prodavnica.setBrojProdavnica());
    }
    public static void stampajKafu(Kafa[] nizKafa){
        for (Kafa kafa : nizKafa){
            System.out.println(kafa.getNaziv() + " " + kafa.getCena());
        }

    }
}
