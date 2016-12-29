/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anastasia
 */

import java.util.ArrayList;
import java.util.Random;

public class Skier implements Comparable<Skier> {
    private String name;
    private int totalScore;
    private ArrayList<Integer> roundScores;
   
   
    
    public Skier (String name) {
        this.name = name;
        this.totalScore = 0;
        this.roundScores = new ArrayList<Integer>();
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getScore () {
        return this.totalScore;
    }
    
    public int jump () {
        //The lowest limit of the points is 60
        int resultLowstLimit = 60; 
        //The highest limit of the points is 120 (60 + max60 from Random = 120)
        
        Random random = new Random();
        int jumpResult = resultLowstLimit + random.nextInt(resultLowstLimit);
        return jumpResult;        
    }
    
    public int addScore (int newScore) {
        return this.totalScore += newScore;
    }
   
    
    
    public String toString () {
        return this.getName() + "(" + this.getScore() + ")";
    }

    
    @Override
    public int compareTo(Skier skier) {
        return this.totalScore - skier.getScore();
    }
}

    
