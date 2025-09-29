
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
    
 /*  
//Brandon Lanzoni carnet: FI25049122

//utilice tik tok y youtube como guias para el proceso y la ia la use solamente para verificar que si funcionara todo y subir el archivo a github

¿Es posible implementar una solución equivalente pero de comportamiento iterativo?
si

¿Cree que hay alguna otra manera recursiva de generar el mismo resultado?
Muy rpobablemnte si


¿Qué relación observa entre el algoritmo para invertir un número natural (calculando y utilizando los cocientes y residuos de las divisiones) con las estrategias para pasar de una base numérica a otra?
sigue la misma base logica de codigo


*/