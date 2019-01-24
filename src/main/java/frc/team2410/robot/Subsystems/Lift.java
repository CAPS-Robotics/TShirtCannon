package frc.team2410.robot.Subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Timer;
import frc.team2410.robot.Robot;

import static frc.team2410.robot.RobotMap.*;

public class Lift {
	private WPI_TalonSRX liftMotor;
	private Indexer indexer;
	private Cannon cannon;
	private Timer t;
	
	public Lift() {
		liftMotor = new WPI_TalonSRX(LIFT);
		liftMotor.setInverted(true);
		indexer = new Indexer();
		cannon = new Cannon();
		t = new Timer();
	}
	
	public void loop() {
		if(Robot.oi.getPOV() == 0) {
			liftMotor.set(.33);
		} else if(Robot.oi.getPOV() == 180) {
			liftMotor.set(-.33);
		} else {
			liftMotor.set(0);
		}
		indexer.loop();
		if(t.get() >= .15) {
			t.stop();
			t.reset();
			cannon.set(false);
		}
	}
	
	public void advanceIndex() {
		indexer.moveTo(36);
	}
	
	public void fire() {
		t.reset();
		t.start();
		cannon.set(true);
	}
}
