public class Autovehicul {
    Sofer sofer;
    double vitezaMax;
    double vitezaCurenta;
    public Autovehicul(Sofer sofer){
        this.sofer = sofer;
    }

    void accelereaza(double delta){
        vitezaCurenta = delta;
    }
}
