package frc.team2410.robot.Subsystems;

import static frc.team2410.robot.RobotMap.*;
import frc.team2410.robot.Robot;

public class Drivetrain {
	TalonPair right;
	TalonPair left;
	public Drivetrain() {
		right = new TalonPair(DRIVE_G1A, DRIVE_G1B, true, true);
		left = new TalonPair(DRIVE_G2A, DRIVE_G2B, false, true);
	}
	public void tankDrive() {
		left.set(Robot.oi.getAxis(0, false));
		right.set(Robot.oi.getAxis(1, false));
	}
	public void stop() {
		left.set(0);
		right.set(0);
	}
}
