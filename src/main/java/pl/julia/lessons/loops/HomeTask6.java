package pl.julia.lessons.loops;

import java.util.Scanner;

public class HomeTask6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("give me number of rows: ");
        Integer rows = scanner.nextInt();
        System.out.println("give me a sign: ");
        String sign = scanner.next();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                if (j < 2 || j >= rows - 2){
                    System.out.print(sign);
                } else{System.out.print("  ");}


            }
            System.out.println();
        }
    }
}

