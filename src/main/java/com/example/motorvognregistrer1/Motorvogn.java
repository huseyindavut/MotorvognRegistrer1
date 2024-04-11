package com.example.motorvognregistrer1;

public class Motorvogn {
    private String eierPersonNr, eiersNavn, eiersAdresse, kjennetegn, bilmerke, biltype;

    public Motorvogn(String eierPerson, String eiersNavn, String eiersAdresse, String kjennettegn, String bilmerke, String biltype) {
        this.eierPersonNr = eierPersonNr;
        this.eiersNavn = eiersNavn;
        this.eiersAdresse = eiersAdresse;
        this.kjennetegn = kjennetegn;
        this.bilmerke = bilmerke;
        this.biltype = biltype;


    }

    public String getEierPersonNr() {
        return eierPersonNr;
    }

    public void setEierPersonNr(String eierPersonNr) {
        this.eierPersonNr = eierPersonNr;
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
        return kjennetegn;
    }

    public void setKjennettegn(String kjennettegn) {
        this.kjennetegn = kjennettegn;
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

