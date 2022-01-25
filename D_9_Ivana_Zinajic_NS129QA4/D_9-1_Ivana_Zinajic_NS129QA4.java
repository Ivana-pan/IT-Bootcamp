public class Kafa {
    private String naziv;
    private String velicina;
    private String[] sastojci;
    private double cena;

    public Kafa(String naziv, String velicina, String[] sastojci, int cena) {
        this.naziv = naziv;
        this.velicina = velicina;
        this.sastojci = sastojci;
        this.cena = cena;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getVelicina() {
        return velicina;
    }

    public void setVelicina(String velicina) {
        this.velicina = velicina;
    }

    public String[] getSastojci() {
        return sastojci;
    }

    public void setSastojci(String[] sastojci) {
        this.sastojci = sastojci;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public double obracunajPopust(int procenat){
        double popust = (this.cena* procenat) / 100;
        return this.cena -=popust;
    }
}


