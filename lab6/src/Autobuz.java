public class Autobuz extends Autovehicul{
    int ruta;

    public Autobuz(int ruta){
        super(new Sofer());
        this.ruta = ruta;
    }

    @Override
    void accelereaza(double delta){
        if(vitezaCurenta < vitezaMax)
            vitezaCurenta = vitezaCurenta + delta;
    }
}
