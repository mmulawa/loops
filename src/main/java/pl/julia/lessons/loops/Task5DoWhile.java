package pl.julia.lessons.loops;

import java.util.Scanner;

public class Task5DoWhile {
    public static void main(String[] args) {
        int numberOfZeros = 0;
        int numberOfNegatives = 0;
        int numberOfPositives = 0;
        String answer;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Please give me a number: ");
            int number = scanner.nextInt();
            if (number == 0) {
                numberOfZeros++;
            } else if (number < 0) {
                numberOfNegatives++;
            } else {
                numberOfPositives++;
            }
            System.out.println("Do you want to give me another number?(y)");
            answer = scanner.next();
        } while (answer.equalsIgnoreCase("y"));
        System.out.println("Number of negatives: " + numberOfNegatives);
        System.out.println("Number of zeros: " + numberOfZeros);
        System.out.println("Number of positives: " + numberOfPositives);
    }
}
