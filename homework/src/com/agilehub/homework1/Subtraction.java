package com.agilehub.homework1;

public record Subtraction(int firstNumber, int secondNumber) implements MathematicalOperation {

    @Override
    public int calculate(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }


}
