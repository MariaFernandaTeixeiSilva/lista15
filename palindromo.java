//problema 12
package vetor;
import java.util.Scanner; 
public class palindromo {

	public static void main (String[] args) {
	Scanner scanner = new Scanner (System.in);
	
    int[] vetor = new int[10];

    preencherVetor(scanner, vetor, "");

    boolean ehPalindromo = verificarPalindromo(vetor);

    if (ehPalindromo) {
        System.out.println("A sequência do vetor é um palíndromo.");
    } else {
        System.out.println("A sequência do vetor não é um palíndromo.");
    }

    scanner.close();
}

public static void preencherVetor(Scanner scanner, int[] vetor, String nomeVetor) {
    System.out.println("Digite 10 elementos para o vetor" + nomeVetor + ":");
    for (int i = 0; i < vetor.length; i++) {
        System.out.print("Elemento " + (i + 1) + ": ");
        vetor[i] = scanner.nextInt();
    }
}

public static boolean verificarPalindromo(int[] vetor) {
    int tamanho = vetor.length;

    for (int i = 0; i < tamanho / 2; i++) {
        if (vetor[i] != vetor[tamanho - 1 - i]) {
            return false; 
        }
    }

    return true;
}
}