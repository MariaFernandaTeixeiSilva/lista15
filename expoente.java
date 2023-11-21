//problema 6
//problema feito com o auxilio do chat gpt
package vetor;
import java.util.Scanner; 
public class expoente {

	public static void main (String[] args) {
	Scanner scanner = new Scanner (System.in);
	
    int[] vetorA = new int[11];

    for (int i = 0; i < vetorA.length; i++) {
        vetorA[i] = (int) Math.pow(2, i);
    }

    System.out.println("Vetor A:");
    for (int i = 0; i < vetorA.length; i++) {
        System.out.println("A[" + i + "] = " + vetorA[i]);
    }
}
}