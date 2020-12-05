package com.dragomiralin.Observer;

import lombok.RequiredArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
public class BusyService {

    private List<BusyServiceObserver> observers = new ArrayList<>();

    public void addObserver(BusyServiceObserver busyServiceObserver){
        observers.add(busyServiceObserver);
    }

    public void updateObjectAndDependencies(String name, LocalDate creationDate) {
        BusyObject busyObject = new BusyObject();
        busyObject.updateObjectAndDependencies(name, creationDate);

        notifyCreationDateUpdate(name, creationDate);

    }

    public void notifyCreationDateUpdate(String name, LocalDate creationDate){
        observers.forEach(busyServiceObserver -> busyServiceObserver.notifyObjectAndDependenciesUpdated(name, creationDate));
    }
}
