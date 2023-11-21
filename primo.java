//problema 3
package vetor;
import java.util.Scanner; 
public class primo {

	public static void main (String[] args) {
	Scanner scanner = new Scanner (System.in);
	
    int[] vetorA = new int[10];

    System.out.println("Digite os 10 elementos do vetor A:");

    for (int i = 0; i < vetorA.length; i++) {
        System.out.print("Elemento " + (i + 1) + ": ");
        vetorA[i] = scanner.nextInt();
    }

    System.out.println("Elementos do vetor A e sua natureza (primo ou não):");

    for (int i = 0; i < vetorA.length; i++) {
        System.out.print("Elemento " + vetorA[i] + ": ");

        if (ehPrimo(vetorA[i])) {
            System.out.println("É um número primo");
        } else {
            System.out.println("Não é um número primo");
        }
    }

    scanner.close();
}

public static boolean ehPrimo(int numero) {
    if (numero <= 1) {
        return false;
    }

    for (int i = 2; i <= Math.sqrt(numero); i++) {
        if (numero % i == 0) {
            return false;
        }
    }

    return true;
}
}
