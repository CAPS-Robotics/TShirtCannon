package frc.team2410.robot;

public class RobotMap {
	//CAN
	public static final int DRIVE_G1A = 0;
	public static final int DRIVE_G1B = 1;
	public static final int DRIVE_G2A = 2;
	public static final int DRIVE_G2B = 3;
	public static final int LIFT = 4;
	public static final int INDEXER = 5;
	public static final int PCM = 6;
	//DIO
	public static final int INDEX_ENCODER_A = 0;
	public static final int INDEX_ENCODER_B = 1;
	//PCM
	public static final int CANNON_FORWARD = 0;
	public static final int CANNON_BACKWARD = 1;
	//MISC
	public static final double INDEX_RATIO = (360.0/12)/80; //Degrees per revolution, ticks per revolution, revolutions of output to revolutions of input
	public static final boolean CANNON_INVERTED = false;
}
