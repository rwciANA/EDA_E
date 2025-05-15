package lab_2;

public class ejercisio_2 {

    void imprimir (int x){
        System.out.println(x);
        imprimir(x-1);
    }
    public static void main(String[] args) {
        ejercisio_2 re =new  ejercisio_2();
        re.imprimir(5);
        
    }
}