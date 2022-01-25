package Telefonija;

import java.util.ArrayList;

public class Korisnik {
    //id (int) - jednoznacan automatski generisan celobrojan identifikator (int) (+3 poena)

    private String ime;
    private String prezime;
    private Broj brojTelefona;
    private ArrayList<Usluga> istorijaUsluga = new ArrayList<>();


    public Korisnik(String ime, String prezime, Broj brojTelefona) {
        this.ime = ime;
        this.prezime = prezime;
        this.brojTelefona = brojTelefona;

    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public Broj getBrojTelefona() {
        return brojTelefona;
    }

    public void setBrojTelefona(Broj brojTelefona) {
        this.brojTelefona = brojTelefona;
    }

    public ArrayList<Usluga> getIstorijaUsluga() {
        return istorijaUsluga;
    }
    //toString metodu, format je
    //		ime prezime broj
    //		Istorija usluga:
    //		<usluga>
    //		<usluga>
    //		....
    //		npr
    //
    //		Zoran Milicevic +381 63 1234567
    //		Istorija usluga:
    //		+381 63 1234567 -> +381 63 4567123 Cao Strahinja!
    //		+381 63 1234567 -> +381 63 4567123 2:34
    @Override
    public String toString(){
        return ime + " " + prezime + " " + brojTelefona + "\n" + "Istorija usluga: \n" + getIstorijaUsluga();
    }
    //napisati metodu posaljiPoruku, koja prima broj na koji treba posalti poruku i tekst poruke.
    //	Metoda kreira poruku i stavlja je u niz istorija usluga.

    public void posaljiPoruku(Broj primalac, String sms){
        Poruke poruka1 = new Poruke(brojTelefona, primalac,sms);
        istorijaUsluga.add(poruka1);
    }
        //napisati metodu pozovi, koja prima broj koji treba pozvati i trajanje poziva u sekundama.
        //	Metoda kreira poziv i stavlja ga u niz istorija usluga.
    public void pozovi(Broj primalac, int trajanje){
        Poziv pozivanje = new Poziv(brojTelefona,primalac,trajanje );
        istorijaUsluga.add(pozivanje);
    }
    //napisati metodu cenaSvihUsluga koja vraca ukupnu cenu svih usluga (double) koje je korisnik obavio,
    //	tako sto prodje kroz niz istorija usluga i sumira cene svih usluga koje se nalaze u tom nizu

    public double cenaSvihUsluga(){
        double suma = 0;
        for(int i =0;i<istorijaUsluga.size();i++){
            suma+=istorijaUsluga.get(i).cenaUsluge();
        }
        return suma;
    }
}
