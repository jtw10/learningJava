import java.util.Random;

/**
 * simulation of opening a fortune cookie
 */

public class FortuneCookie {

    static String[] fortunes = {
            "Today it's up to you to shape the future",
            "If you refuse to accept failure, you'll succeed",
            "It doesn't matter how slowly you go as long as you keep moving",
            "You're a great person - keep it up"
    };


    public static void main(String[] args) {
        Random arrayIndex = new Random();
        int randomIndex = arrayIndex.nextInt(fortunes.length);

        System.out.println(fortunes[randomIndex]);
    }
}
