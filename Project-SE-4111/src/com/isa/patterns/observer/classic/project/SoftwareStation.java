package com.isa.patterns.observer.classic.project;

import java.util.ArrayList;
import java.util.List;

public class SoftwareStation implements Subject {

    private final List<Observer> observersList;
    private String softwareName;
    private String softwareStatus;

    

    public SoftwareStation(String softwareName) {
    	this.softwareName = softwareName;
    	observersList = new ArrayList<>();
    	}

	public void registerObserver(Observer observer) {
        if (!observersList.contains(observer)) {
            this.observersList.add(observer);
        }
    }

    public void removeObserver(Observer observer) {
        this.observersList.remove(observer);
    }

    public void notifyObservers() {
        for (Observer o : observersList) {
            o.update(softwareStatus);
        }
    }

 
    public void setSoftwareStatus(String status) {

    	if(status.equalsIgnoreCase("new")){
    		softwareStatus = this.softwareName + " is an new program";
    	} else if(status.equalsIgnoreCase("updated")){
    		softwareStatus = this.softwareName + " is an updated program";
    	} else if(status.equalsIgnoreCase("unsafe")){
    		softwareStatus = this.softwareName + " is an unsafe program";
    	} else {
    		softwareStatus = "You entered the wrong status,please enter the status of the program as new, updated, or unsafe";
    	}
        notifyObservers();
    }


    
}