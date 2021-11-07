package pl.julia.lessons.loops;

import java.util.Scanner;

public class Loop2 {
    public static void main(String[] args) {
        //Napisz program obliczający silnię liczby wprowadzonej przez użytkownika
        Scanner scan = new Scanner(System.in);
        System.out.println("give me a number: ");
        Integer silnia = scan.nextInt();
        Integer counter = 1;
        for (int i = silnia; i > 0; i--) {
            counter = counter * i;
        }
        System.out.println(counter);
    }
}
