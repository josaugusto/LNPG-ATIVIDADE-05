import java.util.Scanner;
import java.util.Locale;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int primeiroResultado = a + b * c;
        System.out.println(primeiroResultado);

        int segundoResultado = a * b + b * c;
        System.out.println(segundoResultado);

        if (b != 0) {
            int divisaoInteira = a / b / c;
            System.out.println("INTEIRO: " + divisaoInteira);
            double divisaoReal = (double) a / b / c;
            System.out.printf(Locale.US, "REAL: %.4f\n", divisaoReal);
        }
        else {
            System.out.println("INDEFINIDO");
            System.out.println("INDEFINIDO");
        }

        if (primeiroResultado > 0) {
            System.out.println("POSITIVO");
        } else if (primeiroResultado < 0) {
            System.out.println("NEGATIVO");
        } else {
            System.out.println("ZERO");
        }

        sc.close();
    }
}