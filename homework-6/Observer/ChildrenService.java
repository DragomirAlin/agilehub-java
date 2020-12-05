package com.dragomiralin.Observer;

import java.time.LocalDate;

public class ChildrenService implements BusyServiceObserver{

    private final BusyService busyService;

    public ChildrenService(BusyService busyService) {
        this.busyService = busyService;
        this.busyService.addObserver(this);
    }

    @Override
    public void notifyObjectAndDependenciesUpdated(String name, LocalDate creationDate) {
        this.updateChildren();
    }

    private void updateChildren() {
        // do nothing
    }

}
