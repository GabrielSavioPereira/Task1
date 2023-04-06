package Task1;

import java.util.Scanner;

public class IF5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = Integer.MIN_VALUE;
        while (true) {
            System.out.println("Digite um número:");
            while (true) { // enquanto não digitar um número válido, continua no while
                try {
                    num = Integer.parseInt(sc.nextLine());
                    System.out.println("O número digitado é: "+ num);
                    break; // se chegou aqui é porque o número é válido, então posso sair do while
                } catch (NumberFormatException e) {
                    // número inválido
                    System.out.println("Digite um número válido");
                }
            }
        
            // se for -1, sai do while mais externo
            if (num != Integer.MIN_VALUE){
                break;

            }
        
           
        }
    }
}
