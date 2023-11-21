public class Main {
    public static void main(String[] args) {
        Inventar inv1 = new Inventar(5);
        Furnizor furnizor = new Furnizor("Numesrl", "fiscal113", 2000);
        Produs  produsul1 = new Produs("paine", furnizor, 5, 20);
        Produs  produsul2 = new Produs("apa", furnizor, 2, 100);
        Produs  produsul3 = new Produs("cafea", furnizor, 30, 2);
        Produs  produsul4 = new Produs("parfum", furnizor, 300, 75);
        Produs  produsul5 = new Produs("ciocolata", furnizor, 10, 1000);

        inv1.adaugaProdus(produsul1);
        inv1.adaugaProdus(produsul2);
        inv1.adaugaProdus(produsul3);
        inv1.adaugaProdus(produsul4);
        inv1.adaugaProdus(produsul5);

        inv1.listeazaProduse();

        String produsCautat = "ciocolata";
        inv1.gasesteProdusDupaNume(produsCautat);
        Produs produsGasit = inv1.gasesteProdusDupaNume(produsCautat);

        if (produsGasit != null) {
            System.out.println("Produsul " + produsCautat + " este disponibil.");
        }

    }
}