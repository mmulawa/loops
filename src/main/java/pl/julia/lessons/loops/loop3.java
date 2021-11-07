package pl.julia.lessons.loops;

import java.util.Scanner;

public class loop3 {
    public static void main(String[] args) {
        //Napisz program, który przyjmie od użytkownika dwie liczby naturalne,
        //a następnie obliczy wynik podniesienia jednej liczby do potęgi drugiej (xy).
        // Nie używaj metody wbudowanej w język Java.
        Scanner scan = new Scanner(System.in);
        System.out.println("give me a number a: ");
        Integer a = scan.nextInt();
        System.out.println("give me a number b: ");
        Integer b = scan.nextInt();
        Integer product = 1;
        for (int i = 1; i <= b; i++) {
            product = product * a;
        }
        System.out.println(product);
    }
}
