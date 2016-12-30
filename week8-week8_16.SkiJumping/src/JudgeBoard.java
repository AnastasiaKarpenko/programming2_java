import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by anastasia on 30/12/2016.
 */
public class JudgeBoard {
    private static final int JUDGE_NUMBER = 5;

    private List<Judge> judgeList;

    public JudgeBoard() {
        judgeList = new ArrayList<>();
        assignJudges();
    }

    public void judgeSkier(Skier skier) {
        skier.addScore(getScore());
    }

    private int getScore() {
        List<Integer> votes = getScoreList();
        votes.remove(0);
        votes.remove(votes.size() - 1);
        return getSumVotes(votes);
    }

    private int getSumVotes(List<Integer> votes) {
        int sumVotes = 0;
        for(int vote : votes) {
            sumVotes += vote;
        }

        return sumVotes;
    }

    private List<Integer> getScoreList() {
        List<Integer> votes = new ArrayList<>();

        for(Judge judge : judgeList) {
            votes.add(judge.getVote());
        }

        Collections.sort(votes);

        return votes;
    }

    private void assignJudges() {
        for(int i = 0; i < JUDGE_NUMBER; i++) {
            judgeList.add(new Judge());
        }
    }
}
