//problema 10
//problema feito com o auxílio do chat gpt
package vetor;
import java.util.Scanner; 
public class diferença {

	public static void main (String[] args) {
	Scanner scanner = new Scanner (System.in);
	
    int[] vetorA = new int[10];
    int[] vetorB = new int[10];

    preencherVetor(scanner, vetorA, "A");
    preencherVetor(scanner, vetorB, "B");

    int[] vetorC = diferencaConjuntos(vetorA, vetorB);

    System.out.println("Vetor C (Diferença dos conjuntos A e B):");
    exibirVetor(vetorC);

    scanner.close();
}

public static void preencherVetor(Scanner scanner, int[] vetor, String nomeVetor) {
    System.out.println("Digite 10 elementos para o vetor " + nomeVetor + ":");
    for (int i = 0; i < vetor.length; i++) {
        System.out.print("Elemento " + (i + 1) + ": ");
        vetor[i] = scanner.nextInt();
    }
}

public static int[] diferencaConjuntos(int[] vetorA, int[] vetorB) {
    ArrayList<Integer> diferenca = new ArrayList<>();

    for (int elementoA : vetorA) {
        boolean elementoPresente = false;

        for (int elementoB : vetorB) {
            if (elementoA == elementoB) {
                elementoPresente = true;
                break;
            }
        }

        if (!elementoPresente) {
            diferenca.add(elementoA);
        }
    }

    int[] vetorC = new int[diferenca.size()];
    for (int i = 0; i < diferenca.size(); i++) {
        vetorC[i] = diferenca.get(i);
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