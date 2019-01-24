package frc.team2410.robot.Subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import static frc.team2410.robot.RobotMap.*;

class Indexer {
	private WPI_TalonSRX motor;
	private DigitalInput limitSwitch;
	private Encoder encoder;
	private PIDController pid;
	
	Indexer() {
		motor = new WPI_TalonSRX(INDEXER);
		motor.setInverted(true);
		limitSwitch = new DigitalInput(INDEX_SWITCH);
		encoder = new Encoder(INDEX_ENCODER_A, INDEX_ENCODER_B);
		encoder.setReverseDirection(true);
		encoder.setDistancePerPulse(INDEX_RATIO);
		pid = new PIDController(INDEX_P, INDEX_I, INDEX_D, encoder, motor);
		pid.setInputRange(-180, 180);
		pid.setOutputRange(-.5, .5);
		pid.setContinuous(true);
		pid.setEnabled(false);
	}
	
	void loop() {
		SmartDashboard.putNumber("PID input", encoder.getDistance());
		SmartDashboard.putNumber("PID output", pid.get());
		SmartDashboard.putNumber("PID error", pid.getError());
		if(!limitSwitch.get() && Math.abs(pid.getError()) < 30) {
			moveTo(0);
			encoder.reset();
		}
	}
	
	void moveTo(double angle) {
		pid.setSetpoint(angle);
	}
}
