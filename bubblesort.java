import java.util.Random;
public class ordenador {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        int vetor[] = new int[10];
        int aux = 0;
        for (int i = 0; i < 10; i++) {
            vetor[i] = aleatorio.nextInt(100);
        }
        System.out.println("Vetor não ordenado");
        for (int i = 0; i < 10; i++) {
            System.out.print(vetor[i]+"\t");            
        }
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (vetor[i] < vetor[j]){
                    aux = vetor[j];
                    vetor[j] = vetor[i];
                    vetor[i] = aux;
                }
            }
        }
        System.out.println("");
                System.out.println("Vetor ordenado");
                 for (int k = 0; k < 10; k++) {
                System.out.print(vetor[k]+"\t");
                 }
            
        
    }

}
