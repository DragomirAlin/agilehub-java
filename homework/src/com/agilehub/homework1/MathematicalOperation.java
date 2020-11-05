package com.agilehub.homework1;

sealed interface MathematicalOperation permits Addition, Subtraction {

    int calculate(int firstNumber, int secondNumber);

}
