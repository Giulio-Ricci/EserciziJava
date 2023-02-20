package Libreria;


public class Libro {
    private String titolo;
    private String autore;
    private double prezzo;

    public Libro(String titolo, String autore, double prezzo) {
        this.titolo = titolo;
        this.autore = autore;
        this.prezzo = prezzo;
    }

    public String getTitolo() {
        return this.titolo;
    }

    public String getAutore() {
        return this.autore;
    }

    public double getPrezzo() {
        return this.prezzo;
    }
}

