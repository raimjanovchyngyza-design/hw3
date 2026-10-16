import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.print("enter ur num");
//--------------------------------------------------------------------- 7 tusks:
//        int num2 = scanner.nextInt();
//        while (num2 <= 1000) {
//            System.out.println(num2);
//            num2 *= 10;
//        }
//-----------------------------------------------------------------------
//        for (int n2 = scanner.nextInt() ; n2 < 1000 ; n2 *= 10)
//            System.out.println(n2);
//-----------------------------------------------------------------------
//        for (int fr2 = scanner.nextInt() ; fr2 < 1001; fr2 += 1)
//            System.out.println(fr2);
//-----------------------------------------------------------------------
//    z    int rr = scanner.nextInt();
//        int r = 1;
//        System.out.println("1");
//          while (r < rr) {
//              r += 1;
//              System.out.println(r);
//-------------------------------------------------------------------------
//        int w = 1;
//        int ww = scanner.nextInt();
//        do {
//        w += 1;
//        System.out.println(w);
//          }while (ww > w);
//-------------------------------------------------------------------------
//        int xx = scanner.nextInt();
//        int x = 0;
//        do {
//            x += 2;
//            System.out.println(x);
//        }while (x < xx);
//---------------------------------------------------------------------------
//        int zz = scanner.nextInt();
//        int z = 1;
//        while (z < zz) {
//            System.out.println(z);
//            z += 2;
//----------------------------------------------------------------------------
//        int x = 1;
//        do {
//            if (x % 3 == 0 && x % 5 == 0) {
//                System.out.println(x + " FizzBuzz");
//            } else if (x % 5 == 0) {
//                System.out.println(x + " Buzz");
//            } else if (x % 3 == 0) {
//                System.out.println(x + " Fizz");
//            } else {
//                System.out.println(x + " boring");
//            }
//            x += 1;
//        } while (x < 21);
//        ------------------------ 3 tusks 9.10.2026 (ATM pin, Guess the number, Number statistics)
//        final int CrrPin = 1234;
//        final int MaxAtt = 3;
//        int attemptsLeft = MaxAtt;
//        while (attemptsLeft > 0) {
//            System.out.print("Enter PIN: ");
//            int pin = scanner.nextInt();
//            if (pin == CrrPin) {
//                System.out.println("Access granted!");
//                scanner.close();
//                return;
//            }
//            attemptsLeft--;
//            System.out.println("Incorrect.");
//            System.out.println("Attempts left: " + attemptsLeft);
//            System.out.println();
//        }
//        System.out.println("Card blocked.");
//----------------------------------------------
//        final int SecNum = 7;
//        final int MaxAtt = 5;
//        int attempts = 0;
//        while (attempts < MaxAtt) {
//            System.out.print("Enter your guess: ");
//            int guess = scanner.nextInt();
//            attempts++;
//            if (guess == SecNum) {
//                System.out.println("Correct");
//                System.out.println("You needed " + attempts + " attempts.");
//                scanner.close();
//                return;
//            } else if (guess < SecNum) {
//                System.out.println("Too low");
//            } else {
//                System.out.println("Too high");
//            }
//            System.out.println();
//        }
//        System.out.println("Game over!");
//        System.out.println("The secret number was " + SecNum + ".");
//        -------------------------------------------------------
//        int positive = 0;
//        int negative = 0;
//        int zeros = 0;
//        int even = 0;
//        int odd = 0;
//        for (int i = 1; i <= 10; i++) {
//            System.out.print("Enter number " + i + ": ");
//            int number = scanner.nextInt();
//            if (number > 0) {
//                positive++;
//            } else if (number < 0) {
//                negative++;
//            } else {
//                zeros++;
//            }
//            if (number % 2 == 0) {
//                even++;
//            } else {
//                odd++;
//            }
//        }
//        System.out.println();
//        System.out.println("===== STATISTICS =====");
//        System.out.println("Positive numbers: " + positive);
//        System.out.println("Negative numbers: " + negative);
//        System.out.println("Zeros: " + zeros);
//        System.out.println("Even numbers: " + even);
//        System.out.println("Odd numbers: " + odd);
    }
}