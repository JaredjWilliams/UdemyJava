package com.example.udemyjavacourse;

public class MethodChallenge {

    public String methodChallenge(String playerName, int highScore) {
        return "" + playerName + " managed to get to scoring position: " + calculateHighScore(highScore);
    }

    public int calculateHighScore(int highScore) {
        int position = 4;

        if (highScore > 1000) {
            position = 1;
        } else if (highScore >= 500) {
            position = 2;
        } else if (highScore >= 100) {
            position = 3;
        }

        return position;
    }
}
