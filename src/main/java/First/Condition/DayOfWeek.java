package First.Condition;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {

        System.out.println("Please enter day of the week (1 to 7).");

        Scanner scanner = new Scanner(System.in);

        int DayOfWeek = scanner.nextInt();

        switch (DayOfWeek){
            case 1:
                System.out.println("You entered 1. So week day is Monday.");
                break;
            case 2:
                System.out.println("You entered 2. So week day is Tuesday.");
                break;
            case 3:
                System.out.println("You entered 3. So week day is Wednesday.");
                break;
            case 4:
                System.out.println("You entered 4. So week day is Thursday.");
                break;
            case 5:
                System.out.println("You entered 5. So week day is Friday.");
                break;
            case 6:
                System.out.println("You entered 6. So week day is Saturday.");
                break;
            case 7:
                System.out.println("You entered 7. So week day is Sunday.");
                break;
            default:
                System.out.println("Incorrect input. Please run the program again and select from 1 to 7.");
        }
    }
}
