package Second.Condition;

import java.util.Scanner;

public class RectanglePerimeterAndFace {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the width of the rectangle.");
        int width = scanner.nextInt();

        System.out.println("Please enter the length of the rectangle.");
        int length = scanner.nextInt();

        int perimeter = (width * 2) + (length * 2);
        int area = width * length;

        System.out.println("Your rectangle has perimeter of " + perimeter + " and area of " + area + ".");
    }
}
