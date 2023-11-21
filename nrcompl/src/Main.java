import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        MatriceComplexa a = new MatriceComplexa(2, 2);
        MatriceComplexa m1 = new MatriceComplexa(2, 2);
        MatriceComplexa m2 = new MatriceComplexa(2, 2);
        int rows = a.m.length;
        int cols = a.m[0].length;
        int i = 0;
        int j = 0;
        for (i = 0; i < rows; i++) {
            for (j = 0; j < cols; j++) {
                NumarComplex k = new NumarComplex(i, j);
                a.m[i][j] = k;
            }
        }
        m2.m = a.m;
        m2 = m2.add(a);
        for(i = 0; i < rows; i++) {
            for( j = 0; j < cols; j++) {
                System.out.print(m2.m[i][j]);
                System.out.print(" ");
            }
            System.out.print("\n");
        }

        Scanner input = new Scanner(System.in);
        int p = input.nextInt();

    }
}