import java.awt.*;

public class Autovehicul {
    private String marca;
    private Color culoare;
    private int viteza_c;
    private int treapta_c;
    private int viteza_max;
    private int nr_trepte;
    private Sofer sofer;

    public int getNr_trepte() {
        return nr_trepte;
    }

    public void setNr_trepte(int nr_trepte) {
        this.nr_trepte = nr_trepte;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getViteza_c() {
        return viteza_c;
    }

    public void setViteza_c(int viteza_c) {
        this.viteza_c = viteza_c;
    }

    public int getTreapta_c() {
        return treapta_c;
    }

    public void setTreapta_c(int treapta_c) {
        this.treapta_c = treapta_c;
    }

    public int getViteza_max() {
        return viteza_max;
    }

    public void setViteza_max(int viteza_max) {
        this.viteza_max = viteza_max;
    }
    void accelerare(int delta)
    {
        if(viteza_c + delta > viteza_max)
            viteza_c = viteza_max;
        else
            viteza_c += delta;

    }
    void decelerare(int delta)
    {
        if(viteza_c-delta <0)
            viteza_c = 0;
        else
            viteza_c = viteza_c-delta;
    }

    void schimbareTrepte(int delta)
    {
        if(treapta_c+delta > nr_trepte)
            treapta_c = nr_trepte;
        else
            treapta_c = treapta_c+delta;
        if(treapta_c+delta < 0)
            treapta_c = 0;
    }
    void oprire()
    {
        viteza_c = 0;
        treapta_c = 0;
    }
    public Autovehicul( String marca, Color culoare, int viteza_c, int treapta_c, int viteza_max, int nr_trepte,  Sofer sofer)
    {
        this.marca = marca;
        this.culoare = culoare;
        this.viteza_c = viteza_c;
        this.treapta_c = treapta_c;
        this.viteza_max = viteza_max;
        this.nr_trepte = nr_trepte;
        this.sofer = sofer;
    }

    @Override
    public String toString() {
        return "Autovehiculul este marca " + marca + " are vit curenta " + viteza_c + " este in treapta " + treapta_c + " si are culoarea " + culoare +
                " numele soferului e " + sofer.getNume() + " si are varsta de " + sofer.getVarsta();
    }
}
