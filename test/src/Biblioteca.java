public class Biblioteca {
    private Carte[] carti;

    public Biblioteca(int l) {
        carti = new Carte[l];

    }

    public void adaugaCarte(Carte a) {
        int n = carti.length;
        int ok = 1;
        for (int i = 0; i < n; i++) {
            if (a.getID() == carti[i].getID()) {
                ok = 0;
            }
        }
        if (ok == 1 && a.getCopiiDisponibile() > 0) {
            carti[n - 1] = a;
        }
    }

    public void listeazaCarte() {
        int n = carti.length;
        for (int i = 0; i < n; i++) {
            System.out.println(carti[i]);
        }
    }

    public Carte gasesteCarte(String titluCautat) {
        int n = carti.length;
        for (int i = 0; i < n; i++) {
            if (titluCautat != null && carti[i]!=null && carti[i].getTitlu().equals(titluCautat)) {
                return carti[i];
            }

        }
        System.out.println("Cartea cu titlul \"" + titluCautat + "\" nu a fost gasita.");
        return null;
    }
}

