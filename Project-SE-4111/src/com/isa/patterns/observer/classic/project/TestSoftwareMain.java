package com.isa.patterns.observer.classic.project;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestSoftwareMain {

	SoftwareStation software;
	SpecificSoftwareUpdate specificSoftwareUpdate;
	
	@BeforeEach
	public void init() {
		software = new SoftwareStation("Whatsapp");
		specificSoftwareUpdate = new SpecificSoftwareUpdate();
        software.registerObserver(specificSoftwareUpdate); 
	}
	@Test
	void test() {
    	String ss = software.getSoftwareStatus("updated");		
    	assertEquals("Whatsapp is an updated program", ss);	
	}
}
