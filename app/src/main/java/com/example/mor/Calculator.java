package com.example.mor;

public class Calculator {
    private int operation;
    private int result;
    private int num1;
    private int num2;
    public String getExcersice() {
        num1 = (int) (Math.random() * (10 - 0 + 1));
        num2 = (int) (Math.random() * (10 - 0 + 1));
        operation = (int) (Math.random() * (3 - 0 + 1));
        if (operation == 0) {
            result = num1 + num2;
            return "num1 + " + "num2";
        }
        if (operation == 1) {
            result = num1 - num2;
            return "num1 - " + "num2";
        }
        if (operation == 2) {
            result = num1 * num2;
            return "num1 * "+"num2";
        }
        if (operation == 3) {
            result = (int) num1 / num2;
            return "num1/"+"num2";
        }
        return null;
    }
    public boolean check(int userAnswer)
    {
        return userAnswer==result;
    }
}
