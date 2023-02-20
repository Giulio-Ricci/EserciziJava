package Libreria;

import java.util.ArrayList;

public class Libreria {
    private Libro[] libri;

    public Libreria(Libro[] libri) {
        this.libri = libri;
    }

    public int trova(String autore, double k) {
        int count = 0;
        for (Libro libro : this.libri) {
            if (libro.getAutore().equals(autore) && libro.getPrezzo() > k) {
                count++;
            }
        }
        return count;
    }

    public String[] trovaTitoli(String autore) {
        ArrayList<String> titoli = new ArrayList<String>();
        for (Libro libro : this.libri) {
            if (libro.getAutore().equals(autore)) {
                titoli.add(libro.getTitolo());
            }
        }
        return titoli.toArray(new String[titoli.size()]);

    }
}

