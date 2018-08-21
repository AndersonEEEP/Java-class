import java.util.Scanner;
public class insertion_sort {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("Digite quantas posições o vetor deve ter");
        int y = tcl.nextInt();
        int vetor[] = new int[y];       
        System.out.println("Insira os numeros do vetor");
        
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = tcl.nextInt();
        }

        for (int i = 0; i < vetor.length; i++) {
            int x = vetor[i];
            for (int j = i - 1; j >= 0 && vetor[j] > x; j--) {
                vetor[j + 1] = vetor[j];
                vetor[j] = x;
            }
        }
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i]+ "\t");
        }
    }
   
}
