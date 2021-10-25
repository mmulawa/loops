package pl.julia.lessons.loops;

import org.junit.jupiter.api.Test;

public class WhileTest {

    @Test
    public void endlessWhileLoop() {
        int counter = 0;
        while (true) {
            System.out.println("Loop run: " + counter + "\n");
            counter++;
        }
    }

    @Test
    public void counterTerminatedWhileLoop() {
        int counter = 0;
        while (counter < 1000) {
            System.out.println("Loop run: " + counter + "\n");
            counter++;
        }
    }
}
