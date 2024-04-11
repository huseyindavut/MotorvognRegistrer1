package com.example.motorvognregistrer1;

public class Motorvogn {
    private String eierPerson, eiersNavn, eiersAdresse, kjennettegn, bilmerke,biltype;

    public Motorvogn(String eierPerson, String eiersNavn, String eiersAdresse, String kjennettegn, String bilmerke, String biltype) {
        this.eierPerson = eierPerson;
        this.eiersNavn = eiersNavn;
        this.eiersAdresse = eiersAdresse;
        this.kjennettegn = kjennettegn;
        this.bilmerke = bilmerke;
        this.biltype = biltype;
    }

    public String getEierPerson() {
        return eierPerson;
    }

    public void setEierPerson(String eierPerson) {
        this.eierPerson = eierPerson;
    }

    public String getEiersNavn() {
        return eiersNavn;
    }

    public void setEiersNavn(String eiersNavn) {
        this.eiersNavn = eiersNavn;
    }

    public String getEiersAdresse() {
        return eiersAdresse;
    }

    public void setEiersAdresse(String eiersAdresse) {
        this.eiersAdresse = eiersAdresse;
    }

    public String getKjennettegn() {
        return kjennettegn;
    }

    public void setKjennettegn(String kjennettegn) {
        this.kjennettegn = kjennettegn;
    }

    public String getBilmerke() {
        return bilmerke;
    }

    public void setBilmerke(String bilmerke) {
        this.bilmerke = bilmerke;
    }

    public String getBiltype() {
        return biltype;
    }

    public void setBiltype(String biltype) {
        this.biltype = biltype;
    }
}
