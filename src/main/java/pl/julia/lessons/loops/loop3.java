package pl.julia.lessons.loops;

import java.util.Scanner;

public class loop3 {
    public static void main(String[] args) {
        //Napisz program, który przyjmie od użytkownika dwie liczby naturalne,
        //a następnie obliczy wynik podniesienia jednej liczby do potęgi drugiej (xy).
        // Nie używaj metody wbudowanej w język Java.
        Scanner scan = new Scanner(System.in);
        System.out.println("give me a number: ");
        int base = scan.nextInt();
        System.out.println("give me a exponent: ");
        int exponent = scan.nextInt();
        int result = 1;
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        System.out.println(result);
    }
}
