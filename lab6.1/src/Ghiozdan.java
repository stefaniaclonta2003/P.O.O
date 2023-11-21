public class Ghiozdan {
    Rechizita[] lista;
    static int elem = 0;
    public Ghiozdan(){
        lista = new Rechizita[105];
    }
    public void addC(Caiet caiet1){
        lista[elem] = caiet1;
        elem++;
    }

    public void addM(Manual manual1){
        lista[elem] = manual1;
        elem++;
    }

    public void listItems() {
        for (int i = 0; i < elem; i++) {
            if(lista[i] instanceof Manual)
            System.out.println("Manual  " + lista[i].getNume());
            else
                System.out.println("Caiet  " + lista[i].getNume());
        }
    }

    public void printList(){
        for (int i = 0;i < elem; i++)
        {
            if(lista[i] != null)
            System.out.println(lista[i].getNume());

        }
    }

    public static int getElem() {
        return elem;
    }

    public int getNrCaiete(){
        int nrCaiete = 0;
        for(int i = 0; i < elem; i++) {
            if (lista[i] instanceof Caiet)
                nrCaiete++;
        }
         System.out.println("Numarul de caiete: " + nrCaiete);
         return nrCaiete;

    }

    public int getNrManuale(){
        int nrManuale = 0;
        for(int i = 0; i < elem; i++){
            if(lista[i] instanceof Manual)
                nrManuale++;
        }
        System.out.println("Numarul de manuale: " + nrManuale);
        return nrManuale;
    }
}
