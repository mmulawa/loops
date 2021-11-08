package pl.julia.lessons.loops;

import java.util.Scanner;

public class Loop2 {
    public static void main(String[] args) {
        //Napisz program obliczający silnię liczby wprowadzonej przez użytkownika
        Scanner scan = new Scanner(System.in);
        System.out.println("give me a number: ");
        int number = scan.nextInt();
        int result = 1;
        for (int i = number; i > 0; i--) {
            result *= i;
        }
        System.out.println(result);
    }
}
