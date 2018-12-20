package frc.team2410.robot;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.team2410.robot.Subsystems.*;

public class Robot extends IterativeRobot
{
  public static OI oi;
  public static Drivetrain drivetrain;
  public static LED led;
  public static Lift lift;

  public Robot() {}

  public void robotInit() {
    oi = new OI();
    drivetrain = new Drivetrain();
    led = new LED();
    lift = new Lift();
    led.setColor(0, 0, 255);
  }

  public void disabledInit() {
    led.setColor(255, 0, 0);
  }

  public void disabledPeriodic() {
    led.fade();
  }

  public void autonomousInit() {

  }

  public void autonomousPeriodic() {

  }

  public void teleopInit() {
    led.setColor(255, 0, 0);
  }

  public void teleopPeriodic() {
    drivetrain.tankDrive();
    led.fade();
    lift.loop();
  }

  public void testPeriodic() {}
}