import java.util.Scanner;
public class busca_binaria {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);

        
        
        int vetor[] = new int[5];

        System.out.println("Insira os numeros do vetor");
        
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = tcl.nextInt();
        }
        int aux;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (vetor[i] < vetor[j]){
                    aux = vetor[j];
                    vetor[j] = vetor[i];
                    vetor[i] = aux;
                }
            }
        }
         System.out.println("");
                System.out.println("Vetor ordenado");
                 for (int k = 0; k < 5; k++) {
                System.out.print(vetor[k]+"\t");
                 }
  int fim = vetor[4];
  int metade = vetor[3];
  int começo= vetor[0];
        System.out.println(fim);
        System.out.println("Digite o valor que deseja encontrar");
                int encontrar = tcl.nextInt();
                if (encontrar > metade) {
                    System.out.println("O valor está além do meio do vetor"); 
            
        }else{
                    System.out.println("O valor antecede a posição do meio do vetor");    
                }

    } 
}
