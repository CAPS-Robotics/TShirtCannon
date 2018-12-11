package frc.team2410.robot;

import edu.wpi.first.wpilibj.XboxController;

public class OI {
	XboxController controller;
	public OI() {
		controller = new XboxController(0);
	}
	public double getAxis(int stickNum, boolean xAxis) {
		return controller.getRawAxis((xAxis ? 0 : 1) + (stickNum*2));
	}
}
