package frc.team2410.robot.Subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.Encoder;

import static frc.team2410.robot.RobotMap.*;

public class Indexer {
	WPI_TalonSRX motor;
	Encoder encoder;
	public Indexer() {
		motor = new WPI_TalonSRX(INDEXER);
		motor.setInverted(false);
		encoder = new Encoder(INDEX_ENCODER_A, INDEX_ENCODER_B);
		encoder.setDistancePerPulse(INDEX_RATIO);
	}
}
