import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Masina masina = new Masina(1, "Ford", "Mov");
        Student s = new Student("Stefi", 1,  masina);
        Student s1 = new Student("Maria", 2, masina);
        s1 = s.clone();
        System.out.println(s);
        System.out.println(s1);
        s1.masina.vopseste("portocaliu");
        System.out.println(s);
        System.out.println(s1);

        Masina[] arr;
        arr = new Masina[3];
        Masina m1 = new Masina(20, "Bmw", "alb");
        Masina m2 = new Masina(3, "audi", "rosu");
        Masina m3 = new Masina(7, "dacia", "galben");
        arr[0] = m1;
        arr[1] = m2;
        arr[2] = m3;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);

        String a1 = "Ana are mere";
        String a2 = "Andra are mere";
        System.out.println(a1.compareTo(a2));
    }
}