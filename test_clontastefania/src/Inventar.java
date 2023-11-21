public class Inventar {
    Produs[] lista;

    public Inventar(int k) {
        lista = new Produs[k];

    }

    public void adaugaProdus(Produs p) {
        int len = lista.length;
        int verif = 1;
        for (int i = 0; i < len; i++) {
            if (p != null  && lista[i] != null && p.getNume() == lista[i].getNume())
                verif = 0;
        }
        if (verif == 1 && p.getCantitateinStoc() > 0)
            lista[len - 1] = p;
    }

    public void listeazaProduse() {
        int len = lista.length;
        for (int i = 0; i < len; i++) {
            if(lista[i]!=null)
            System.out.println(lista[i].toString());
        }
    }

    public Produs gasesteProdusDupaNume(String nume) {
        int len = lista.length;
        for (int i = 0; i < len; i++) {
            if (lista[i] != null && lista[i].getNume().equals(nume)) {
                return lista[i];
            }
        }
        System.out.println("Produsul " + nume + " nu exista!");
        return null;
    }

}