package com.survivalcoding;

public class GameConfig {
    final static int defaultScore = 0;

    static int calculateDamage(int attackPoint) {
        return 0;
    }

    public static void main(String[] args) {
        int score = GameConfig.defaultScore;
        GameConfig.calculateDamage(3);
    }
}
