import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GameController {

    private Random random = new Random();
    private List<Integer> integers = new ArrayList<>();

    public int generateNumber() {
        int number;
        do {
            number = random.nextInt(74) + 1;
        } while (isRepeatedNumber(number));
        this.integers.add(number);
        return number;
    }

    private boolean isRepeatedNumber(final int number) {
        for (Integer integer : this.integers) {
            if (integer == number) {
                return true;
            }
        }
        return false;
    }
}
