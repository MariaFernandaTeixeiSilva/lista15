//problema 7
package vetor;
import java.util.Scanner; 
public class fatorialDeA {

	public static void main (String[] args) {
	Scanner scanner = new Scanner (System.in);
	
	int[] vetorA = new int[15];

    long[] vetorB = new long[vetorA.length];

    System.out.println("Digite 15 elementos para o vetor A:");

    for (int i = 0; i < vetorA.length; i++) {
        System.out.print("Elemento " + (i + 1) + ": ");
        vetorA[i] = scanner.nextInt();
    }

    System.out.println("Vetor A:");
    exibirVetor(vetorA);


    for (int i = 0; i < vetorA.length; i++) {
        vetorB[i] = calcularFatorial(vetorA[i]);
    }

    System.out.println("Vetor B (fatoriais de A):");
    exibirVetor(vetorB);

    scanner.close();
}

public static long calcularFatorial(int numero) {
    if (numero == 0 || numero == 1) {
        return 1;
    }

    long resultado = 1;
    for (int i = 2; i <= numero; i++) {
        resultado *= i;
    }

    return resultado;
}

public static void exibirVetor(long[] vetor) {
    for (long elemento : vetor) {
        System.out.print(elemento + " ");
    }
    System.out.println();
}
}
