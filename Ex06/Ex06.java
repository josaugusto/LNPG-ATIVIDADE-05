package Ex06;

import java.util.*;

public class Ex06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        int n = sc.nextInt();

        double[] valores = new double[n];

        for (int i = 0; i < n; i++) {
            valores[i] = sc.nextDouble();
        }

        double min = valores[0];
        double max = valores[0];
        double soma = 0;

        for (int i = 0; i < n; i++) {
            if (valores[i] < min) min = valores[i];
            if (valores[i] > max) max = valores[i];
            soma += valores[i];
        }

        System.out.printf(Locale.US, "MIN: %.2f\n", min);
        System.out.printf(Locale.US, "MAX: %.2f\n", max);

        double media = soma / n;
        System.out.printf(Locale.US, "MEDIA: %.2f\n", media);

        if (n == 1) {
            System.out.println("INDEFINIDA");
        } else {
            double variancia = 0;

            for (int i = 0; i < n; i++) {
                variancia += Math.pow(valores[i] - media, 2);
            }

            variancia /= (n - 1);
            System.out.printf(Locale.US, "VARIANCIA: %.4f\n", variancia);
        }

        int qtdInteiros = 0;

        for (int i = 0; i < n; i++) {
            if (valores[i] == (int) valores[i]) {
                qtdInteiros++;
            }
        }

        System.out.println("INTEIROS: " + qtdInteiros);

        int qtdAcimaMedia = 0;

        for (int i = 0; i < n; i++) {
            if (valores[i] > media) {
                qtdAcimaMedia++;
            }
        }

        System.out.println("ACIMA_MEDIA: " + qtdAcimaMedia);

        sc.close();
    }
}