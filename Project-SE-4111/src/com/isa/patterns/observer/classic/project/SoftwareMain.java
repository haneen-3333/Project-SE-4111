package com.isa.patterns.observer.classic.project;


public class SoftwareMain {

    public static void main(String[] args) {
    	
        final SoftwareStation software = new SoftwareStation("Whatsapp");
        final SoftwareStation software2 = new SoftwareStation("Youtube");
        final SoftwareStation software3 = new SoftwareStation("Instagram");

        
        
        
        final SpecificSoftwareUpdate specificSoftwareUpdate = new SpecificSoftwareUpdate();
        software.registerObserver(specificSoftwareUpdate); 

        final NewSoftware newSoftware = new NewSoftware();
        software2.registerObserver(newSoftware); 
        
        final UnsafeSoftware unsafeSoftware = new UnsafeSoftware();
        software3.registerObserver(unsafeSoftware); 
        
        for (int i = 0; i < 2; i++) {
        // enter the status of the program is new, updated, unsafe
        	software.setSoftwareStatus("updated");
        	software2.setSoftwareStatus("New");
        	software3.setSoftwareStatus("unsafe");
        	
            software3.removeObserver(unsafeSoftware); 
            System.out.println("***************************************");
        }
        
    }
    
}

