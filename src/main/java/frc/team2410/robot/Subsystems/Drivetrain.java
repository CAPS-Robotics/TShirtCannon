package frc.team2410.robot.Subsystems;

import static frc.team2410.robot.RobotMap.*;

import frc.team2410.robot.Robot;

public class Drivetrain {
	private TalonPair right;
	private TalonPair left;
	
	public Drivetrain() {
		right = new TalonPair(DRIVE_G1A, DRIVE_G1B, false, true);
		left = new TalonPair(DRIVE_G2A, DRIVE_G2B, true, true);
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
