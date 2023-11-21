//problema 14
package vetor;
import java.util.Scanner; 
public class receberMaior {

	public static void main (String[] args) {
	Scanner scanner = new Scanner (System.in);
	
    int[] vetorA = new int[10];

    // Preencher o vetor A com elementos fornecidos pelo usu�rio
    preencherVetor(scanner, vetorA, "A");

    // Construir o vetor B com os somat�rios
    int[] vetorB = construirVetorB(vetorA);

    // Exibir vetores A e B
    System.out.println("Vetor A:");
    exibirVetor(vetorA);

    System.out.println("\nVetor B (Somat�rio de A):");
    exibirVetor(vetorB);

    scanner.close();
}

// M�todo para preencher um vetor com elementos fornecidos pelo usu�rio
public static void preencherVetor(Scanner scanner, int[] vetor, String nomeVetor) {
    System.out.println("Digite 10 elementos para o vetor " + nomeVetor + ":");
    for (int i = 0; i < vetor.length; i++) {
        System.out.print("Elemento " + (i + 1) + ": ");
        vetor[i] = scanner.nextInt();
    }
}

// M�todo para construir um vetor B com os somat�rios dos elementos correspondentes e subsequentes de A
public static int[] construirVetorB(int[] vetorA) {
    int[] vetorB = new int[vetorA.length];

    for (int i = 0; i < vetorA.length; i++) {
        for (int j = i; j < vetorA.length; j++) {
            vetorB[i] += vetorA[j];
        }
    }

    return vetorB;
}

// M�todo para exibir um vetor
public static void exibirVetor(int[] vetor) {
    for (int elemento : vetor) {
        System.out.print(elemento + " ");
    }
    System.out.println();
}
}