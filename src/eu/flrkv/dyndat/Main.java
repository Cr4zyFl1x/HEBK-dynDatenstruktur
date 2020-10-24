package eu.flrkv.dyndat;

public class Main {

    public static void main(String[] args) {

        Datenstruktur d1 = new Datenstruktur();

        d1.add(new Aufgabe("Hallo", "123"));
        d1.add(new Aufgabe("Hi", "1231"));
        d1.add(new Aufgabe("Hia", "1231a"));

        d1.deleteLast();
        System.out.println(d1.getLast().getText());
        System.out.println(d1.search("Hallo").getText());
    }
}
