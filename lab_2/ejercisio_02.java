package lab_2;
public class ejercisio_02{

    void imprimir (int x){
        System.out.println(x);
        imprimir(x-1);
    }
    public static void main(String[] args) {
        ejercisio_02 re =new  ejercisio_02();
        re.imprimir(5);
        
    }
}