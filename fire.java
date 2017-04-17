package robot;

import org.jointheleague.graphical.robot.Robot;

public class fire {
public static void main(String[] args) {
	Robot fire = new Robot();
	fire.moveTo(180, 250);
			fire.penDown();
			fire.setRandomPenColor();
			fire.setSpeed(10);
			fire.move(200);
			fire.turn(90);
			fire.move(100);
			fire.turn(180);
			fire.move(100);
			fire.turn(-90);
			fire.move(100);
			fire.turn(-90);
			fire.move(100);
			fire.turn(180);
			fire.move(100);
			fire.turn(-90);
			fire.move(100);
			fire.turn(-90);
			fire.move(100);
			fire.penUp();
			fire.move(100);
			fire.penDown();
			fire.setRandomPenColor();
			fire.turn(-90);
			fire.move(200);
			fire.turn(145);
			fire.move(240);
			fire.turn(-145);
			fire.move(200);
}
}
