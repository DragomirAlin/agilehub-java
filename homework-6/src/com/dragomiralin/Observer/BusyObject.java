package com.dragomiralin.Observer;

import lombok.Data;

import java.time.LocalDate;

@Data
public class BusyObject {

    private Integer id;
    private String name;
    private LocalDate creationDate;


    public void updateObjectAndDependencies(String name, LocalDate creationDate) {
        this.name = name;
        if (creationDate.isBefore(this.creationDate)) {
            throw new IllegalArgumentException("The date can't be set before the original creation date");
        }
    }
}
