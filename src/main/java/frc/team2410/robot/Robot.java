package frc.team2410.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import frc.team2410.robot.Subsystems.*;

public class Robot extends TimedRobot {
	public static OI oi;
	public static Drivetrain drivetrain;
	public static LED led;
	public static Lift lift;
	
	public Robot() {}
	
	@Override
	public void robotInit() {
		oi = new OI();
		drivetrain = new Drivetrain();
		led = new LED();
		lift = new Lift();
		led.setColor(0, 0, 255);
	}
	
	@Override
	public void robotPeriodic() {
	
	}
	
	@Override
	public void disabledInit() {
		led.setColor(0, 0, 255);
	}
	
	@Override
	public void disabledPeriodic() {
		led.breathe(0, 0, 255, 0, 255, 255);
	}
	
	@Override
	public void autonomousInit() {}
	
	@Override
	public void autonomousPeriodic() {}
	
	@Override
	public void teleopInit() {
		led.setColor(255, 0, 0);
	}
	
	@Override
	public void teleopPeriodic() {
		drivetrain.tankDrive();
		oi.pollButtons();
		led.fade();
		lift.loop();
	}
	
	@Override
	public void testPeriodic() {}
}