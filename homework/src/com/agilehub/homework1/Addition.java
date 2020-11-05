package com.agilehub.homework1;

public record Addition(int firstNumber, int secondNumber) implements MathematicalOperation {


    public int calculate(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }


}
