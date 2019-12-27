package frc.team2410.robot;

public class RobotMap {
	//CAN
	public static final int DRIVE_G1A = 0;
	public static final int DRIVE_G1B = 1;
	public static final int DRIVE_G2A = 2;
	public static final int DRIVE_G2B = 3;
	public static final int LIFT = 4;
	public static final int INDEXER = 5;
	//DIO
	public static final int INDEX_SWITCH = 0;
	public static final int INDEX_ENCODER_A = 1;
	public static final int INDEX_ENCODER_B = 2;
	//PWM
	public static final int CANNON = 0;
	//PID
	public static final double INDEX_P = 1.0/72.0;
	public static final double INDEX_I = 0;
	public static final double INDEX_D = 0;
	//MISC
	public static final double INDEX_RATIO = 2; //horrifically bad
}
