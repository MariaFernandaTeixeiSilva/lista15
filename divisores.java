//problema 5
package vetor;
import java.util.Scanner; 
public class divisores {
	
	public static void main (String[] args) {
	Scanner scanner = new Scanner (System.in);
	
    System.out.println("Digite 10 elementos para o vetor A:");
    int[] vetorA = new int[10];

    for (int i = 0; i < vetorA.length; i++) {
        System.out.print("Elemento " + (i + 1) + ": ");
        vetorA[i] = scanner.nextInt();
    }

    System.out.println("Elementos do vetor A e seus divisores:");

    for (int i = 0; i < vetorA.length; i++) {
        System.out.print("Elemento " + vetorA[i] + ": ");
        imprimirDivisores(vetorA[i]);
    }

    scanner.close();
}

public static void imprimirDivisores(int numero) {
    for (int i = 1; i <= numero; i++) {
        if (numero % i == 0) {
            System.out.print(i + " ");
        }
    }
    System.out.println(); 
}
}
