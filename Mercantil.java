import java.util.Scanner;
public class Mercantil {
    public static void main(String[] args) {
       String matriz[][] = new String[5][3];
       Scanner tcl = new Scanner(System.in);
       matriz [0][0] = "123";
       matriz [0][1] = "Blusa";
       matriz [0][2] = "29.9";
       
       matriz [1][0] = "456";
       matriz [1][1] = "Short";
       matriz [1][2] = "39.9";
       
       matriz [2][0] = "789";
       matriz [2][1] = "Casaquinho";
       matriz [2][2] = "49.9";
       
       matriz [3][0] = "987";
       matriz [3][1] = "Moleton";
       matriz [3][2] = "59.9";
       
       matriz [4][0] = "654";
       matriz [4][1] = "Sobretudo";
       matriz [4][2] = "69.9";

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j]+ "\t");
            }
            System.out.println(" ");
        }
    }
}
