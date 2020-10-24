package eu.flrkv.dyndat;

public class Knoten {

    // Attribute
    private Aufgabe inhalt;
    private Knoten nachfolger;

    // GET & SET
    public void setNachfolger(Knoten pNachfolger) {
        this.nachfolger = pNachfolger;
    }

    public void setInhalt(Aufgabe pAufgabe) {
        this.inhalt = pAufgabe;
    }

    public Aufgabe getInhalt() {
        return this.inhalt;
    }

    public Knoten getNachfolger() {
        return this.nachfolger;
    }

}
