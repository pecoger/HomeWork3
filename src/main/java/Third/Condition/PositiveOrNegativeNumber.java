package Third.Condition;

import java.util.Scanner;

public class PositiveOrNegativeNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number");
        int number = scanner.nextInt();

        if (number > 0){
            System.out.println("The number is positive");
        }else {
            System.out.println("The number is negative");
        }
    }
}
