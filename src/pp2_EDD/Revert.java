package pp2_EDD;

import javax.swing.JOptionPane;

public class Revert {

  public static void main(String[] args) {
    MyStack<Character> stack = new MyStack<Character>();

    String palabra = JOptionPane.showInputDialog("Ingrese su palabra:");

    if (palabra == null) {
      // El usuario canceló el diálogo; salir sin hacer nada
      System.out.println("No se proporcionó ninguna palabra.");
      return;
    }

    // Meter los caracteres en la pila
    for (int i = 0; i < palabra.length(); i++) {
      stack.push(palabra.charAt(i));
    }

    // Sacarlos en orden inverso
    System.out.print("Texto invertido: ");
    while (!stack.empty()) {
      System.out.print(stack.pop());
    }
    System.out.println();
  }
}
