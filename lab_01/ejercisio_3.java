import java.util.Arrays;

public class ejercisio_3 {
    public static void main(String[] args) {
        int[] arreglo = {7, 3, 9, 1, 5};

        System.out.println("Arreglo original: " + Arrays.toString(arreglo));
        insercion(arreglo);
        System.out.println("Arreglo ordenado: " + Arrays.toString(arreglo));
    }

    static void insercion(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int actual = arr[i];
            int j = i - 1;
           
            while (j >= 0 && arr[j] > actual) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = actual;
        }
    }
}

