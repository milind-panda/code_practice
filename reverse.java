package swap.java;

import java.util.Scanner;

class ReverseNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int reverse = 0;

        while (number != 0) {
            int digit = number % 10;      // get last digit
            reverse = reverse * 10 + digit;
            number = number / 10;         // remove last digit
        }

        System.out.println("Reversed number: " + reverse);
    }
}
