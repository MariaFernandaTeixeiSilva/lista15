//problema 11
//Este problema foi feito com o auxílio do chat gpt
package vetor;
import java.util.Scanner; 
public class procura {

	public static void main (String[] args) {
	Scanner scanner = new Scanner (System.in);
	
    int[] vetorA = new int[10];

    preencherVetor(scanner, vetorA, "A");

    System.out.print("Digite o elemento a ser pesquisado: ");
    int elementoX = scanner.nextInt();

    boolean encontrado = buscarElemento(vetorA, elementoX);

    if (encontrado) {
        System.out.println("O elemento " + elementoX + " está presente no vetor A.");
    } else {
        System.out.println("O elemento " + elementoX + " não está presente no vetor A.");
    }

    scanner.close();
}

public static void preencherVetor(Scanner scanner, int[] vetor, String nomeVetor) {
    System.out.println("Digite 10 elementos para o vetor " + nomeVetor + ":");
    for (int i = 0; i < vetor.length; i++) {
        System.out.print("Elemento " + (i + 1) + ": ");
        vetor[i] = scanner.nextInt();
    }
}

public static boolean buscarElemento(int[] vetor, int elemento) {
    for (int i = 0; i < vetor.length; i++) {
        if (vetor[i] == elemento) {
            return true; 
        }
    }
    return false; 
}
}
