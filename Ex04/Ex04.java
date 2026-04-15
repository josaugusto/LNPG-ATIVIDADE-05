import java.util.*;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeroDeValores = Integer.parseInt(sc.nextLine());
        List<Object> valores = new ArrayList<>();

        for (int i = 0; i < numeroDeValores; i++) {
            String entrada = sc.nextLine();

            if (entrada.equals("True")) {
                valores.add(true);
            } else if (entrada.equals("False")) {
                valores.add(false);
            } else {
                try {
                    int valorInt = Integer.parseInt(entrada);
                    valores.add(valorInt);
                } catch (Exception e1) {
                    try {
                        double valorDouble = Double.parseDouble(entrada);
                        valores.add(valorDouble);
                    } catch (Exception e2) {
                        // ignora valores inválidos
                    }
                }
            }
        }

        double soma = 0;

        for (Object valor : valores) {
            if (valor instanceof Boolean) {
                boolean b = (Boolean) valor;
                System.out.println("bool: " + b + " (int=" + (b ? 1 : 0) + ")");
            } else if (valor instanceof Integer) {
                int i = (Integer) valor;
                System.out.println("int: " + i);
                soma += i;
            } else if (valor instanceof Double) {
                double d = (Double) valor;
                System.out.println("float: " + d);
                soma += d;
            }
        }

        System.out.printf(Locale.US, "SOMA: %.2f\n", soma);

        sc.close();
    }
}