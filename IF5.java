package Task1;

import java.util.Scanner;

public class IF5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = Integer.MIN_VALUE;
        while (true) {
            System.out.println("Digite um número:");
            while (true) {
                try {
                    num = Integer.parseInt(sc.nextLine());
                    System.out.println("O número digitado é: "+ num);
                    break; 
                } catch (NumberFormatException e) {
                    System.out.println("Digite um número válido");
                }
            }
        
            if (num != Integer.MIN_VALUE){
                break;

            }
        
           
        }
    }
}
