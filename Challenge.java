package level3;

import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level3.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
	}

	public void initialize() {
	driveDirect(480,500);
	sleep(2500);
	driveDirect(0,0);
	driveDirect(0,100);
	sleep(1500);
	driveDirect(0,0);
	driveDirect(450,500);
	sleep(2200);
	driveDirect(0,0);
	driveDirect(0,-150);
	sleep(2500);
	driveDirect(0,0);
	driveDirect(450,500);
	sleep(3000);
	driveDirect(0,0);
	driveDirect(0,100);
	sleep(4500);
	driveDirect(0,0);
	
	
	
	}

	public void loop() {
	
	}
}
