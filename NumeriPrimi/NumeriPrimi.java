package NumeriPrimi;

import java.util.Scanner;

public class NumeriPrimi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Inserire il primo numero: ");
        int firstNum = input.nextInt();
        System.out.print("Inserire il secondo numero: ");
        int secondNum = input.nextInt();

        System.out.println("I numeri primi compresi tra " + firstNum + " e " + secondNum + " sono: ");
        for (int i = firstNum; i <= secondNum; i++) {
            if (Primo(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean Primo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
