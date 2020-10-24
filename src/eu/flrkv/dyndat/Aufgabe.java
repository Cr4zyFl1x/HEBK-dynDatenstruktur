package eu.flrkv.dyndat;

public class Aufgabe {

    // Attribute
    private String text;
    private String datum;

    public Aufgabe(String pText, String pDate) {
        this.text = pText;
        this.datum = pDate;
    }

    // GET & SET
    public void setText(String pText) {
        this.text = pText;
    }

    public void setDatum(String pDatum) {
        this.datum = pDatum;
    }

    public String getText() {
        return this.text;
    }

    public String getDatum() {
        return this.datum;
    }
}
