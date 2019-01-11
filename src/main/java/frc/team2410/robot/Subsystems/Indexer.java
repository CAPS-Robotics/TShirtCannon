package frc.team2410.robot.Subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.Encoder;

import static frc.team2410.robot.RobotMap.*;

class Indexer {
	private WPI_TalonSRX motor;
	private Encoder encoder;
	int index;
	
	Indexer() {
		motor = new WPI_TalonSRX(INDEXER);
		motor.setInverted(false);
		encoder = new Encoder(INDEX_ENCODER_A, INDEX_ENCODER_B);
		encoder.setDistancePerPulse(INDEX_RATIO);
		index = 0;
	}
	
	double getIndex() {
		return (((encoder.get()%360)+360)%360)/18.0;
	}
	
	void loop() {
		double i = (index-getIndex()+15)%10-5;
		if(Math.abs(getIndex()-index) > .01) {
			motor.set(0.15*(Math.abs(i) > 1 ? (i/Math.abs(i)) : i));
		}
	}
}
