package eu.flrkv.dyndat;

public class Datenstruktur {

    private Knoten first = new Knoten();


    public void add(Aufgabe pAufgabe) {
        Knoten current = first;
        while (current.getNachfolger() != null) {
            current = current.getNachfolger();
        }
        current.setNachfolger(new Knoten());
        current.getNachfolger().setInhalt(pAufgabe);
    }

    public Aufgabe search(String pKey) {
        Knoten current = first;

        while (current != null) {
            if (current.getInhalt() != null && current.getInhalt().getText().equals(pKey)) {
                return current.getInhalt();
            } else {
                current = current.getNachfolger();
            }
        }
        return null;
    }

    public Aufgabe getLast() {
        Knoten current = first;

        while (current.getNachfolger() != null) {
            current = current.getNachfolger();
        }
        return current.getInhalt();
    }

    public void deleteLast() {
        Knoten current = first;

        while (current.getNachfolger() != null) {
            if (current.getNachfolger().getNachfolger() != null) {
                current = current.getNachfolger();
            } else {
                break;
            }
        }
        current.setNachfolger(null);
    }

}
