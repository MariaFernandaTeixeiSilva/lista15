//problema 9
//Este problema foi feito com o auxílio do chat gpt
package vetor;
import java.util.Scanner; 
public class interseccao {

	public static void main (String[] args) {
	Scanner scanner = new Scanner (System.in);
	
    int[] vetorA = new int[10];
    int[] vetorB = new int[10];

    preencherVetor(scanner, vetorA, "A");
    preencherVetor(scanner, vetorB, "B");


    int[] vetorC = intersecaoVetores(vetorA, vetorB);

    System.out.println("Vetor C (Interseção de A e B):");
    exibirVetor(vetorC);

    scanner.close();
}


public static void preencherVetor(Scanner scanner, int[] vetor, String nomeVetor) {
    System.out.println("Digite os 10 elementos para o vetor " + nomeVetor + ":");
    for (int i = 0; i < vetor.length; i++) {
        System.out.print("Elemento " + (i + 1) + ": ");
        vetor[i] = scanner.nextInt();
    }
}

public static int[] intersecaoVetores(int[] vetorA, int[] vetorB) {
   
    int count = 0;
    for (int elementoA : vetorA) {
        for (int elementoB : vetorB) {
            if (elementoA == elementoB) {
                count++;
                break; 
            }
        }
    }

    int[] vetorC = new int[count];

    int index = 0;
    for (int elementoA : vetorA) {
        for (int elementoB : vetorB) {
            if (elementoA == elementoB) {
                vetorC[index++] = elementoA;
                break; 
            }
        }
    }

    return vetorC;
}

public static void exibirVetor(int[] vetor) {
    for (int elemento : vetor) {
        System.out.print(elemento + " ");
    }
    System.out.println();
}
}
