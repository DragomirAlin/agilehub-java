package com.dragomiralin.Strategy;

public class FirstNameStrategy implements NameStrategy{
    @Override
    public void showName(String firstName, String lastName) {
        System.out.println(firstName + " " + lastName);
    }
}
