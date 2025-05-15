package lab_2.ejercisios_propuestos;


public class problem_1 {


         public static void main(String[] args) {

        int [] array= {2,4,56,3,34,66,67,7,3};
        
        int [] c =invertir( array);
             System.out.println("imprimiendo array invertido ");
        for (int i = 0; i < c.length; i++) {
           
            System.out.println(c[i]);
        }
        
    }
    
    public static int [] invertir (int [] a){

        int []b  = new int[a.length];
        for(int idx =a.length-1 ,i=0;  i< a.length &&idx >=0 ; i++,idx--){
            
            b[i]=a[idx];

        }

        
        return b;

    }
}