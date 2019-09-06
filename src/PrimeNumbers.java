import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        int num1, num2, num3;
        String checkanother = " ";
        boolean pm = false;
        Scanner key = new Scanner(System.in);

        System.out.println(" Enter your number to check if it  a prime number: ");
        num1 = key.nextInt();
        num2 = 1;
        num3 = 0;

        while (num2 <= num1) {
            if ((num1 % num2) == 0)
                num3 = num3 + 1;
            num2++;
        }
        if (num3 == 2)
            System.out.println(num1 + " is a prime number.");
        else System.out.println(num1 + " is not a prim number");

        while (num1 >= 1) {

            System.out.println(" Enter another number to check if it  is a prime number or not: ");
            num1 = key.nextInt();
            num2 = 1;
            num3 = 0;

            while (num2 <= num1) {
                if ((num1 % num2) == 0)
                    num3 = num3 + 1;
                num2++;
            }
            if (num3 == 2)
                System.out.println(num1 + " is a prime number.");
            else System.out.println(num1 + " is not a prim number");

        }
    }
}
