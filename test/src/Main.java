public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca(3);

        Autor autor1 = new Autor("John", "Doe", 35);
        Autor autor2 = new Autor("Jane", "Smith", 42);

        Carte carte1 = new Carte(1, "Cartea 1", autor1, 3);
        Carte carte2 = new Carte(2, "Cartea 2", autor1, 2);
        Carte carte3 = new Carte(3, "Cartea 3", autor2, 1);

        biblioteca.adaugaCarte(carte1);
        biblioteca.adaugaCarte(carte2);
        biblioteca.adaugaCarte(carte3);

        System.out.println("Lista cartilor din biblioteca:");
        biblioteca.listeazaCarte();

        String titluCautat = "Cartea 2";
        Carte carteGasita = biblioteca.gasesteCarte(titluCautat);

        if (carteGasita != null) {
            System.out.println("Cartea cu titlul \"" + titluCautat + "\" este disponibila in biblioteca.");
        }
    }
}