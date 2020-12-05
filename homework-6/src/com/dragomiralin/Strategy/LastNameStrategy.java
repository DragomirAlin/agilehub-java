package com.dragomiralin.Strategy;

public class LastNameStrategy implements NameStrategy{
    @Override
    public void showName(String firstName, String lastName) {
        System.out.println(lastName + " " + firstName);
    }
}
