import java.util.Scanner;
import java.util.Random;

public class VerificarNaMatriz {
    public static void main(String[] args) {
        
        Scanner tcl = new Scanner(System.in);
        Random num = new Random();
        
        int matriz[][] = new int[4][3];
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = num.nextInt(101);
            }
        }
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println(" ");
        }
        
        System.out.println("Digite o numero que deseja procurar na matriz");
        int procurar = tcl.nextInt();
        
        boolean aux = false;
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] == procurar) {
                    aux = true;
                }
            }
        }
                   
                if (aux == true) {
                    System.out.println("Numero Encontrado");
                }else{
                    System.out.println("Numero não existe na matriz");   
                }

    }
}
