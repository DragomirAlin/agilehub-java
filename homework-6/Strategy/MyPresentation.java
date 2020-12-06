package com.dragomiralin.Strategy;

public class MyPresentation {
    private NameStrategy nameStrategy;

    public void setNameStrategy(NameStrategy nameStrategy) {
        if(!(nameStrategy instanceof NameStrategy)){
            throw new RuntimeException("Strategy not found");
        }
        this.nameStrategy = nameStrategy;
    }

    public void myNameIs(String firstName, String lastName){
        nameStrategy.showName(firstName, lastName);
    }
}
