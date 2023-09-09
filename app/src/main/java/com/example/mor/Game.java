package com.example.mor;

public class Game {
    protected int exercises = 0;
    protected int rightAnswers = 0;

    public void addExercise() {
        exercises++;
    }

    public void addRightAnswer() {
        rightAnswers++;
    }
}