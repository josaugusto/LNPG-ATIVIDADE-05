import java.util.Scanner;
import java.util.Locale;

public class Ex08 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        int k = sc.nextInt();

        int[] valores = new int[k];

        for (int i = 0; i < k; i++) {
            valores[i] = sc.nextInt();
        }

        float real = sc.nextFloat();

        int soma = 0;

        for (int i = 0; i < k; i++) {
            soma += valores[i];
        }

        System.out.println("SOMA_BRUTA: " + soma);
        System.out.printf(java.util.Locale.US, "SOMA_ESCALADA: %.2f\n", soma * real);

        int xor_check = 0;

        for (int i = 0; i < k; i++) {
            xor_check ^= valores[i];
        }

        System.out.println("XOR_CHECK: " + xor_check);

        int media = soma / k;
        System.out.println("MEDIA_INT: " + media);

        int qtd_acima_media = 0;

        System.out.print("ACIMA_MEDIA: ");
        boolean primeiro = true;

        for (int i = 0; i < k; i++) {
            if (valores[i] > media) {
                if (!primeiro) {
                    System.out.print(" ");
                }
                System.out.print(valores[i]);
                primeiro = false;
                qtd_acima_media++;
            }
        }

        if (qtd_acima_media == 0) {
            System.out.print("NENHUM");
        }

        System.out.println();

        if (xor_check == 0) {
            System.out.println("STATUS: OK");
        } else {
            System.out.println("STATUS: ERRO " + xor_check);
        }

        sc.close();
    }
}
