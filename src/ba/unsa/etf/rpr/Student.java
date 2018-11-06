package ba.unsa.etf.rpr;

public class Student {

    private String ime;
    private String prezime;
    private Integer brojIndeksa;

    Student(String ime, String prezime, Integer brojIndeksa) {
        this.ime = ime;
        this.prezime = prezime;
        this.brojIndeksa = brojIndeksa;
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

    public Integer getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(Integer brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

}
