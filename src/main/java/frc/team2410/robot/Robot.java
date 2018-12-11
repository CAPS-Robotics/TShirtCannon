package frc.team2410.robot;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.team2410.robot.Subsystems.*;

public class Robot extends IterativeRobot
{
  public static OI oi;
  public static Drivetrain drivetrain;

  public Robot() {}

  public void robotInit() {
    oi = new OI();
    drivetrain = new Drivetrain();
  }

  public void disabledInit() {}

  public void disabledPeriodic() {

  }

  public void autonomousInit() {

  }

  public void autonomousPeriodic() {

  }

  public void teleopInit() {

  }

  public void teleopPeriodic() {
    drivetrain.tankDrive();
  }

  public void testPeriodic() {}
}