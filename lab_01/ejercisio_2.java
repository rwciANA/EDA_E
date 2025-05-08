import java.util.*;

public class CribaEratostenes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el límite superior del rango: ");
        int n = sc.nextInt();

        boolean[] esPrimo = new boolean[n + 1];
        Arrays.fill(esPrimo, true);
        esPrimo[0] = esPrimo[1] = false;

        for (int i = 2; i * i <= n; i++) {
            if (esPrimo[i]) {
                for (int j = i * i; j <= n; j += i)
                    esPrimo[j] = false;
            }
        }

        System.out.println("Números primos hasta " + n + ":");
        for (int i = 2; i <= n; i++) {
            if (esPrimo[i])
                System.out.print(i + " ");
        }
    }
}

