//problema 2
package vetor;
import java.util.Scanner; 
public class tabaduada {

	public static void main (String[] args) {
	Scanner scanner = new Scanner (System.in);
	
    int[] vetorA = new int[5];

    preencherVetor(scanner, vetorA, "A");

    for (int i = 0; i < vetorA.length; i++) {
        System.out.println("Tabuada do elemento " + vetorA[i] + ":");
        imprimirTabuada(vetorA[i]);
        System.out.println(); 
    }

    scanner.close();
}

public static void preencherVetor(Scanner scanner, int[] vetor, String nomeVetor) {
    System.out.println("Digite 5 elementos para o vetor " + nomeVetor + ":");
    for (int i = 0; i < vetor.length; i++) {
        System.out.print("Elemento " + (i + 1) + ": ");
        vetor[i] = scanner.nextInt();
    }
}

public static void imprimirTabuada(int numero) {
    for (int i = 1; i <= 10; i++) {
        System.out.println(numero + " x " + i + " = " + (numero * i));
    }
}
}
