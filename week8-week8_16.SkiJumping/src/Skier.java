import java.util.Random;

public class Skier implements Comparable<Skier> {
    private String name;
    private int score;

    
    public Skier (String name) {
        this.name = name;
        this.score = 0;

    }
    
    public String getName() {
        return this.name;
    }

    public int getScore () {
        return this.score;
    }

    public void addScore (int score) {
        this.score += score;
    }

    public int jump () {
        //The lowest limit of the points is 60
        int resultLowestLimit = 60;
        //The highest limit of the jump result is 120 (60 + max60 from Random = 120)

        Random random = new Random();
        int jumpResult = resultLowestLimit + random.nextInt(resultLowestLimit);
        return jumpResult;
    }

    @Override
    public int compareTo(Skier skier) {
        return this.getScore() - skier.getScore();
    }
}
    

    
