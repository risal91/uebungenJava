package Day10.Aufgabe0;

public class Song {
    private String titel;
    private  int dauerSekunden;
    private String interpret;


    public Song(String titel, int dauerSekunden, String interpret) {
        this.titel = titel;
        this.dauerSekunden = dauerSekunden;
        this.interpret = interpret;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public int getDauerSekunden() {
        return dauerSekunden;
    }

    public void setDauerSekunden(int dauerSekunden) {
        this.dauerSekunden = dauerSekunden;
    }

    public String getInterpret() {
        return interpret;
    }

    public void setInterpret(String interpret) {
        this.interpret = interpret;
    }


    public void spielen(){
        int minuten = dauerSekunden / 60;
        int sekunden = dauerSekunden % 60;
        System.out.println("Song: " + titel);
        System.out.println("Interpret: " + interpret);
        System.out.println("Dauer: "+ String.format("%02d:%02d", minuten, sekunden) + " Minuten");
        System.out.println();

    }
}
