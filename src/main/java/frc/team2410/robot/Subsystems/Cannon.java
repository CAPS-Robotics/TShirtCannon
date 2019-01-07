package frc.team2410.robot.Subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import static edu.wpi.first.wpilibj.DoubleSolenoid.Value.*;

import static frc.team2410.robot.RobotMap.*;

public class Cannon {
	public DoubleSolenoid solenoid;
	public Cannon() {
		solenoid = new DoubleSolenoid(CANNON_FORWARD, CANNON_BACKWARD, PCM);
		solenoid.set(kForward);
	}
	public void set(boolean on) {
		solenoid.set((CANNON_INVERTED ? on : !on) ? kForward : kReverse);
	}
}
