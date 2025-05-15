
package lab_2;
class ejercisio_01 {

    void  repetir(){
        repetir();
    }

    public static void main(String[] args) {
        System.err.println("hola");
    ejercisio_01 re= new  ejercisio_01();
        re.repetir();
    }
}