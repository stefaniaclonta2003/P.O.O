public class Persoana implements Comparable {
    private String nume;
    private String prenume;
   private int varsta;

   public Persoana(String nume, String prenume, int varsta){
       this.nume = nume;
       this.prenume = prenume;
       this.varsta = varsta;
   }
   public String getNume(){
       return nume;
   }

    public String getPrenume() {
        return prenume;
    }

    public int getVarsta() {
        return varsta;
    }

    @Override
    public int compareTo(Object o) {
       Persoana pers = (Persoana) o;
         return this.nume.compareTo(pers.nume);
    }
}
