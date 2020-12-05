package com.agilehub.homework1;

public record Subtraction(int firstNumber, int secondNumber) implements MathematicalOperation {

    @Override
    public int calculate() {
        return firstNumber - secondNumber;
    }


}
