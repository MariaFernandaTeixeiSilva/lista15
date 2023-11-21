//problema 4
//problema feito com o auxilio do chat gpt
package vetor;
import java.util.Scanner; 
public class pares {

	public static void main (String[] args) {
	Scanner scanner = new Scanner (System.in);
	
    int[] vetorA = new int[10];

    preencherVetor(scanner, vetorA, "A");


    for (int i = 0; i < vetorA.length; i++) {
        System.out.println("Elemento " + vetorA[i] + ":");
        imprimirRelacaoPares(vetorA[i]);
        System.out.println(); 
    }

    scanner.close();
}

public static void preencherVetor(Scanner scanner, int[] vetor, String nomeVetor) {
    System.out.println("Digite 10 elementos para o vetor " + nomeVetor + ":");
    for (int i = 0; i < vetor.length; i++) {
        System.out.print("Elemento " + (i + 1) + ": ");
        vetor[i] = scanner.nextInt();
    }
    System.out.println();
}

public static void imprimirRelacaoPares(int numero) {
    for (int i = 0; i <= numero; i++) {
        if (i % 2 == 0) {
            System.out.print(i + " ");
        }
    }
    System.out.println();
}
}