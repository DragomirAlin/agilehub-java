package com.dragomiralin.Strategy;

public class MyPresentation {
    private NameStrategy nameStrategy;

    public void setNameStrategy(NameStrategy nameStrategy) {
        if(nameStrategy instanceof NameStrategy){
            this.nameStrategy = nameStrategy;
        }else {
            System.out.println("Not a valid strategy");
        }
    }

    public void myNameIs(String firstName, String lastName){
        nameStrategy.showName(firstName, lastName);
    }
}
