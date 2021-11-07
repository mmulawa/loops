package pl.julia.lessons.loops;

import java.util.Scanner;

public class Loop4 {
    public static void main(String[] args) {
        //Napisz program, który przyjmie od użytkownika liczbę całkowitą, a następnie
        //wydrukuje ją od tyłu, np. dla liczby 12345, wynik działania programu to 54321.
        //(2 wersje: z wyznaczaniem i bez wyznaczania liczby o odwrotnych cyfrach)
        Scanner scanner = new Scanner(System.in);
        System.out.println("give me a number: ");
        Integer number = scanner.nextInt();
        while (number > 0) {
            System.out.print(number % 10);
            number = number / 10;
        }
    }
}
