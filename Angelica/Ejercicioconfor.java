
 import java.util.Scanner;
 
public class Ejercicioconfor {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int cantidadPares = 0;
            int cantidadCeros = 0;
            int cantidadNegativos = 0;
            
            System.out.println("Ingresa 20 números:");
            
            for (int i = 0; i < 20; i++) {
                int numero = scanner.nextInt();
                
                if (numero % 2 == 0) {
                    cantidadPares++;
                }
                
                if (numero == 0) {
                    cantidadCeros++;
                }
                
                if (numero < 0) {
                    cantidadNegativos++;
                }
            }
            
            System.out.println("Cantidad de números pares: " + cantidadPares);
            System.out.println("Cantidad de ceros: " + cantidadCeros);
            System.out.println("Cantidad de números negativos: " + cantidadNegativos);
            
        }
    }
}
   

