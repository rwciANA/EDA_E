import java.util.*;

public class GestionCalificaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el número de estudiantes: ");
        int n = sc.nextInt();
        double[] calificaciones = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Calificación del estudiante " + (i + 1) + ": ");
            calificaciones[i] = sc.nextDouble();
        }

        Arrays.sort(calificaciones);
        System.out.println("Mediana: " + calcularMediana(calificaciones));
        System.out.println("Moda: " + calcularModa(calificaciones));
        System.out.println("Desviación estándar: " + calcularDesviacionEstandar(calificaciones));
    }

    public static double calcularMediana(double[] notas) {
        int n = notas.length;
        if (n % 2 == 0)
            return (notas[n / 2 - 1] + notas[n / 2]) / 2;
        else
            return notas[n / 2];
    }

    public static double calcularModa(double[] notas) {
        Map<Double, Integer> frecuencia = new HashMap<>();
        for (double nota : notas)
            frecuencia.put(nota, frecuencia.getOrDefault(nota, 0) + 1);

        int maxFreq = Collections.max(frecuencia.values());
        for (Map.Entry<Double, Integer> entry : frecuencia.entrySet()) {
            if (entry.getValue() == maxFreq)
                return entry.getKey();  
        }
        return -1;
    }

    public static double calcularDesviacionEstandar(double[] notas) {
        double suma = 0;
        double media = Arrays.stream(notas).average().orElse(0.0);
        for (double nota : notas)
            suma += Math.pow(nota - media, 2);
        return Math.sqrt(suma / notas.length);
    }
}
