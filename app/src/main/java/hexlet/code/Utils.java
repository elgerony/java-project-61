package hexlet.code;
import java.util.Random;

public class Utils {
    public static int generateRandom(int min, int max) {
        return new Random().nextInt(max - min) + min;
    }
}
