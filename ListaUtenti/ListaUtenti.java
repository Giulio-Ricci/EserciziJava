package ListaUtenti;

import java.util.ArrayList;

public class ListaUtenti {
    private String code;
    private String name;

    public ListaUtenti(String code, String name) {
        this.code = code;
        this.name = name;
    }
    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        // lista utenti
        ArrayList<ListaUtenti> users = new ArrayList<>();
        users.add(new ListaUtenti("001", "Giacomo"));
        users.add(new ListaUtenti("002", "Francesco"));
        users.add(new ListaUtenti("003", "Andrea"));
        users.add(new ListaUtenti("004", "Luigi"));
        users.add(new ListaUtenti("005", "Gianni"));
        users.add(new ListaUtenti("006", "Francesco"));
        users.add(new ListaUtenti("007", "Nicola"));

        // cerca utente 007
        for (ListaUtenti user : users) {
            if (user.getCode().equals("007")) {
                System.out.println("Utente con codice uguale a 007: " + user.getName());
            }
        }
    }
}
