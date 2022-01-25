package D_11_Ivana_Zinajic_NS129QA4;

public class AlkoholnaPica extends Pice {

    private double procenatAlkohola;

    public AlkoholnaPica(String barKod, String naziv, double cena, double procenatAlkohola, String izborAmbalaze) {
        super(barKod, naziv, cena, izborAmbalaze);
        this.procenatAlkohola = procenatAlkohola;
        this.setCenaSaPopustom(this.getCenaSaPopustom()-this.getCenaSaPopustom()+50/100);
    }

    public double getProcenatAlkohola() {
        return procenatAlkohola;
    }
    public void setProcenatAlkohola(double procenatAlkohola){
        this.procenatAlkohola=procenatAlkohola;
    }

    @Override
    public String toString() {
        return "Naziv " + getNaziv() + "\n" + "cena " + getCena() + "\n procenat alkohola " + procenatAlkohola + "%" +
                " vrsta ambalaze " + getAMBALAZA();
    }
}
