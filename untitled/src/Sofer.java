public class Sofer {
    int varsta;
    String nume;

    public int getVarsta() {
        return varsta;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public Sofer(int varsta, String nume){
        this.varsta = varsta;
        this.nume = nume;
    }

}
