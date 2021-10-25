package pl.julia.lessons.loops;

import java.util.Random;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(1000);
        System.out.println(number);
        Scanner scanner = new Scanner(System.in);
        int answer = -1;
        do {
            answer = scanner.nextInt();
            if (answer > number) {
                System.out.println("Is greater");
            } else if (answer < number) {
                System.out.println("Is lower");
            }

        } while (number != answer);
        System.out.println("You won!");
    }
}
