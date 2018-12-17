package frc.team2410.robot.Subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import frc.team2410.robot.Robot;

import static frc.team2410.robot.RobotMap.*;

public class Lift {
	public WPI_TalonSRX liftMotor;
	Indexer indexer;
	public Lift() {
		liftMotor = new WPI_TalonSRX(LIFT);
		liftMotor.setInverted(true);
		indexer = new Indexer();
	}
	public void loop() {
		if(Robot.oi.getPOV() == 0) {
			liftMotor.set(.33);
		} else if(Robot.oi.getPOV() == 180) {
			liftMotor.set(-.33);
		} else {
			liftMotor.set(0);
		}
	}
}
