package com.isa.patterns.observer.classic.project;


public class SpecificSoftwareUpdate implements Observer{
    	
        public void update(String msg) {
            System.out.println( "New notification: " + msg);
    }
}
