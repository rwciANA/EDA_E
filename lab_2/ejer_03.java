package lab_2;

public class ejer_03 {
    
    void imprimir (int x){
        if(x > 0){
            System.out.println(x);
            imprimir(x-1);
        }
    }
    public static void main(String[] args) {
        ejer_03 re = new  ejer_03();
        re.imprimir(5);
    }
}
