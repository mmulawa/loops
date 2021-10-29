package pl.julia.lessons.loops;

import java.util.Scanner;

public class Task7ForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a sign to print: ");
        String sign = scanner.next();
        System.out.println("Give me a number of lines to print: ");
        Integer number = scanner.nextInt();

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                if ((i < 2 || i >= number - 2) //first two and last two rows
                        || (i >= 2 && i < number - 2 //rows except first two and last two
                        && (j < 2 || j >= number - 2))) {// first two and last two columns
                    System.out.print(sign);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}
