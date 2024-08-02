import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import core.Contador;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

       try {
       System.out.println("Contador de Numeros");

       System.out.print("Numero inicial: ");
       int numero1 = entrada.nextInt();
       System.out.print("Numero final: ");
       int numero2 = entrada.nextInt();

       entrada.close();

       Contador.contar(numero1, numero2);
       } catch (InputMismatchException e) {
           System.out.println("Informe apenas numeros inteiros.");
       }
    }
}
