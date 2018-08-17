
import java.util.Random;
import java.util.Scanner;


public class buscasequencial {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        Random aleatorio = new Random();
        
        int vetor[] = new int[5];
        boolean ganhou= false;
        for (int i = 0; i < 5; i++) {
            vetor[i] = aleatorio.nextInt(100);
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(vetor[i]);
            
        }
 
        System.out.println("Digite seu numero da sorte(até 100)");
        int valor = tcl.nextInt();
        for (int i = 0; i < 5; i++) {
            if (valor == vetor[i]){
                System.out.println("Numero acertado");
                ganhou = true;
                break;
            }
        }
        if (ganhou == false){
            System.out.println("Que azar, numero não acertado");
        }       
    }
}
