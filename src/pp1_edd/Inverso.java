
package pp1_edd;
import java.util.Scanner;
public class Inverso {

  
    public static void main(String[] args) {
  
      Scanner sc = new Scanner(System.in);


        System.out.print("Ingrese un numero natural: ");
        int numero = sc.nextInt();

   
        System.out.print(numero + " pasa a ");

      
        int inverso = invertir(numero, 0);

        System.out.println(inverso);

        sc.close();
    }


    private static int invertir(int numero, int acumulador) {
        if (numero == 0) {
            return acumulador;
        }
        int residuo = numero % 10;   
        int cociente = numero / 10;  
        return invertir(cociente, acumulador * 10 + residuo);
    }
}
    
    

