import java.awt.*;


public class Main {
    public static void main(String[] args) {

        Sofer gica = new Sofer(20, "Gigi");
        Autovehicul masina = new Autovehicul("bmw", Color.BLUE, 30, 4, 200, 6, gica);
        System.out.println(masina);
        masina.accelerare(20);
        System.out.println(masina);
        masina.decelerare(30);
        System.out.println(masina);
        masina.schimbareTrepte(-1);
        System.out.println(masina);

        }
    }
