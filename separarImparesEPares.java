//problema 1
package vetor;
import java.util.Scanner; 
public class separarImparesEPares {

	public static void main (String[] args) {
	Scanner scanner = new Scanner (System.in);
	
	
    int[] vetorA = new int[20];

    System.out.println("Digite os 20 elementos do vetor A:");

 
    for (int i = 0; i < vetorA.length; i++) {
        System.out.print("Elemento " + (i + 1) + ": ");
        vetorA[i] = scanner.nextInt();
    }

 
    int[] vetorB = new int[vetorA.length]; 
    int[] vetorPares = new int[vetorA.length];
    
    int indicePares = 0;
    int indiceImpares = 0;

    for (int i = 0; i < vetorA.length; i++) {
        if (vetorA[i] % 2 == 0) {
            vetorPares[indicePares] = vetorA[i];
            indicePares++;
        } else {
            vetorB[indiceImpares] = vetorA[i];
            indiceImpares++;
        }
    }

    System.out.println("Vetor A (pares):");
    for (int i = 0; i < indicePares; i++) {
        System.out.print(vetorPares[i] + " ");
    }

    System.out.println(); 
    System.out.println("Vetor B (ímpares):");
    for (int i = 0; i < indiceImpares; i++) {
        System.out.print(vetorB[i] + " ");
    }

    scanner.close();
}
}
	

