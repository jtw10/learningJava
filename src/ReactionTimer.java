import java.util.Scanner;

/**
 * A program that counts down and times how fast the user's reactions are
 * After the countdown, hit any key and enter as quickly as possible.
 */

public class ReactionTimer {

    public static void main(String[] args) throws InterruptedException {

        printInstructions();
        countdownTimer();
        calculateReactionTime();

    }

    private static void calculateReactionTime() {
        long startTime = System.currentTimeMillis();
        Scanner s = new Scanner(System.in);
        s.next();
        long endTime = System.currentTimeMillis();
        long reactionTime = endTime - startTime;
        System.out.println(reactionTime + "ms");
    }

    private static void printInstructions() throws InterruptedException {
        System.out.println("After the countdown, hit any key and enter as quickly as possible!");
        System.out.println("The lower the time, the faster your responses are!");
        Thread.sleep(2000);
    }

    private static void countdownTimer() throws InterruptedException {
        System.out.println("3");
        Thread.sleep(1000);
        System.out.println("2");
        Thread.sleep(1000);
        System.out.println("1");
        Thread.sleep(1000);
        System.out.println("Go!!!");
    }
}
