package frc.team2410.robot.Subsystems;

import edu.wpi.first.wpilibj.Talon;

import static frc.team2410.robot.RobotMap.*;

class Cannon {
	private Talon solenoid;
	Cannon() {
		solenoid = new Talon(CANNON);
		solenoid.set(0);
	}
	void set(boolean on) {
		solenoid.set(on ? 1 : 0);
	}
}
