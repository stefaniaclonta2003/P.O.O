import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Persoana[] persoane;
        persoane = new Persoana[3];
        Persoana p1 = new Persoana("Clonta", "Stefania", 20);
        Persoana p2 = new Persoana("Jarda", "Adina", 21);
        Persoana p3 = new Persoana("Popa", "Bianca", 35);
        persoane[0] = p1;
        persoane[1] = p2;
        persoane[2] = p3;
        Arrays.sort(persoane);
        for (int i = 0; i < persoane.length; i++)
            System.out.println(persoane[i]);
        String a1 = "Ana are mere";
        String a2 = "Andra are mere";
        System.out.println(a1.compareTo(a2));
    }
    }
