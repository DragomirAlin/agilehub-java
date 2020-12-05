package com.dragomiralin.Observer;

import java.time.LocalDate;

public class HistoryMessage implements BusyServiceObserver{
    private final BusyService busyService;

    public HistoryMessage(BusyService busyService) {
        this.busyService = busyService;
        this.busyService.addObserver(this);
    }

    @Override
    public void notifyObjectAndDependenciesUpdated(String name, LocalDate creationDate) {
        this.addHistoryMessage();
    }

    private void addHistoryMessage() {
        // do nothing
    }



}
