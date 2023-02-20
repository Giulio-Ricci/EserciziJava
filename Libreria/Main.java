package Libreria;

public class Main {
    public static void main(String[] args) {
        Libro[] libri = {
                new Libro("I promessi sposi", "Alessandro Manzoni", 10.00),
                new Libro("La caduta dei giganti", "Ken Follet", 12.50),
                new Libro("I pilastri della terra", "Ken Follet", 10.50),
                new Libro("La divina commedia", "Dante Alighieri", 8.50)
        };

        Libreria libreria = new Libreria(libri);

        int numLibri = libreria.trova("Ken Follet", 11.00);
        System.out.println("Libri Ken Follet, prezzo maggiore di 11:  " + numLibri);

        String[] titoli = libreria.trovaTitoli("Ken Follet");
    }

}
