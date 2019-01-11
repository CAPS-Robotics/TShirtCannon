package frc.team2410.robot.Subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

class TalonPair {
	private WPI_TalonSRX a;
	private WPI_TalonSRX b;
	
	TalonPair(int aAddr, int bAddr, boolean inv, boolean sameDir) {
		a = new WPI_TalonSRX(aAddr);
		b = new WPI_TalonSRX(bAddr);
		a.setInverted(inv);
		b.setInverted(sameDir ? inv : !inv);
	}
	
	void set(double speed) {
		a.set(speed);
		b.set(speed);
	}
}
