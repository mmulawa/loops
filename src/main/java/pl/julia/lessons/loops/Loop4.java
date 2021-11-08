package pl.julia.lessons.loops;

import java.util.Scanner;

public class Loop4 {
    public static void main(String[] args) {
        //Napisz program, który przyjmie od użytkownika liczbę całkowitą, a następnie
        //wydrukuje ją od tyłu, np. dla liczby 12345, wynik działania programu to 54321.
        //(2 wersje: z wyznaczaniem i bez wyznaczania liczby o odwrotnych cyfrach)
        Scanner scanner = new Scanner(System.in);
        System.out.println("give me a number: ");
        int number = scanner.nextInt();
        int reversed = 0;
        int i = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            System.out.print(lastDigit);
            reversed = reversed * 10 + lastDigit;
            i++;
            number /= 10;
        }
        System.out.println("\nreversed number is: " + reversed);
    }
}
