package Fourth.Condition;

import java.util.Scanner;

public class HighestNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter three numbers.");

        System.out.println("Please enter the first number.");
        int first = scanner.nextInt();

        System.out.println("Please enter the second number.");
        int second = scanner.nextInt();

        System.out.println("Please enter the third number.");
        int third = scanner.nextInt();

        if ((first > second) && (first > third)){
            System.out.println("The first number is the highest number.");
        }
        else if ((second > first) && (second > third)){
            System.out.println("The second number is the highest number.");
        }
        else if ((third > first) && (third > second)){
            System.out.println("The third number is the highest number.");
        }
    }
}
