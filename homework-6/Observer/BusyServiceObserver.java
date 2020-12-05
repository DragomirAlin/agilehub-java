package com.dragomiralin.Observer;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public interface BusyServiceObserver {

    void notifyObjectAndDependenciesUpdated(String name, LocalDate creationDate);


}
