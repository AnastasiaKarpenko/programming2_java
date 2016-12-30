import java.util.Random;

/**
 * Created by anastasia on 30/12/2016.
 */

public class Judge {
    private static final int LOWEST_VOTE = 10;

    private Random random;

    public Judge () {
        random = new Random();
    }

    public int getVote() {
        return LOWEST_VOTE + random.nextInt(LOWEST_VOTE);
    }
}
