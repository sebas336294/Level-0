import org.jointheleague.graphical.robot.Robot;

public class Triangle {
public static void main(String[] args) {
	Robot Hi=new Robot("batman");
	for (int i = 0; i < 4; i++) {
		Hi.setSpeed(10);
		Hi.penDown();
		Hi.turn(30);
		Hi.move(80);
		Hi.turn(120);
		Hi.move(80);
		Hi.turn(120);
		Hi.move(80);
		Hi.penUp();	
	}
}}
