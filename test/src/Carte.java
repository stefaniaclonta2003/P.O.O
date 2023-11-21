public class Carte {
    private int ID;
    private String titlu;
    private Autor autor;
    private int copiiDisponibile;

    public Carte(int ID, String titlu, Autor autor, int copiiDisponibile) {
        this.ID = ID;
        this.titlu = titlu;
        this.autor = autor;
        this.copiiDisponibile = copiiDisponibile;
    }

    public int getID() {
        return ID;
    }

    public String getTitlu() {
        return titlu;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public int getCopiiDisponibile() {
        return copiiDisponibile;
    }

    public void setCopiiDisponibile(int copiiDisponibile) {
        this.copiiDisponibile = copiiDisponibile;
    }

    @Override
    public String toString() {
        return "Carte: " + titlu + " (ID: " + ID + ", Copii Disponibile: " + copiiDisponibile + ", " + autor.toString() + ")";
    }
}
