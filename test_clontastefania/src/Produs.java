public class Produs {
    private String nume;
    private Furnizor furnizor;
    private int pret;
    private int cantitateinStoc;
     public Produs(String nume, Furnizor furnizor, int pret, int cantitateInStoc)
     {
         this.nume = nume;
         this.furnizor = furnizor;
         this.pret = pret;
         this.cantitateinStoc = cantitateInStoc;
     }
     public Produs()
     {

     }

    public String getNume() {
        return nume;
    }

    public int getPret() {
        return pret;
    }

    public Furnizor getFurnizor() {
        return furnizor;
    }

    public void setFurnizor(Furnizor furnizor) {
        this.furnizor = furnizor;
    }

    public int getCantitateinStoc() {
        return cantitateinStoc;
    }

    public void setCantitateinStoc(int cantitateinStoc) {
        this.cantitateinStoc = cantitateinStoc;
    }
   @Override
   public String toString(){
         return "Produsul este " + nume + " si este furnizat de " + furnizor.getNumeSRL() +
                 " are pretul de " + pret + " lei " + " iar in stoc mai sunt " + cantitateinStoc + " bucati.";
   }
}
