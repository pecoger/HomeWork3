package Third.Condition;

import java.util.Scanner;

public class EvenOroddNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number:");
        int number = scanner.nextInt();

        if (number % 2 == 0){
            System.out.println("The number is even.");
        }else {
            System.out.println("The number is odd.");
        }
    }
}
