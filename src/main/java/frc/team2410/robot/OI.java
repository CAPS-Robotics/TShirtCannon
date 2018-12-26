package frc.team2410.robot;

import edu.wpi.first.wpilibj.XboxController;

public class OI {
	XboxController controller;
	boolean[] canPress = new boolean[12];
	
	public OI() {
		controller = new XboxController(0);
	}
	
	public void pollButtons() {
		if(leadingEdge(7)) {
			Robot.lift.advanceIndex();
		}
	}
	
	public boolean leadingEdge(int num) {
		if(controller.getRawButton(num+1)) {
			if(canPress[num]) {
				canPress[num] = false;
				return true;
			}
		} else { canPress[num] = true; }
		return false;
	}
	
	public int getPOV() {
		return controller.getPOV(0);
	}
	
	public double getAxis(int stickNum, boolean xAxis) {
		return applyDeadzone(controller.getRawAxis((xAxis ? 0 : 1)+(stickNum*2)), 0.1, 1);
	}
	
	double applyDeadzone(double val, double deadzone, double maxval) {
		if(Math.abs(val) <= deadzone) {
			return 0;
		}
		
		double sign = val/Math.abs(val);
		val = sign*maxval*(Math.abs(val)-deadzone)/(maxval-deadzone);
		return val;
	}
}
