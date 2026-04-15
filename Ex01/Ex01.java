import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(java.util.Locale.US);

        double numeroReal = sc.nextDouble();

         System.out.printf(java.util.Locale.US, "%d\n", (int) numeroReal);
         System.out.printf(java.util.Locale.US, "%.2f\n", (float) numeroReal);
         System.out.printf(java.util.Locale.US, "%.2f\n", numeroReal);
         System.out.printf(java.util.Locale.US, "%.6f\n", Math.abs(numeroReal - (float) numeroReal));

        sc.close();
    }
}
