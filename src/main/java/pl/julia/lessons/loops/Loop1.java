package pl.julia.lessons.loops;

public class Loop1 {
    public static void main(String[] args) {
        //Napisz program, który obliczy sumę pierwszych 10ciu liczb naturalnych.
        int i = 0;
        int counter = 0;
        while (i < 10) {
            i++;
            counter = counter + i;
        }
        System.out.println(counter);
    }
}
