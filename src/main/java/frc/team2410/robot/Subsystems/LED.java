package frc.team2410.robot.Subsystems;

import com.mach.LightDrive.*;
import static frc.team2410.robot.RobotMap.*;

public class LED {
	LightDriveCAN controller;
	public LED() {
		controller = new LightDriveCAN();
	}
	int state = 0;
	int r = 255;
	int b = 0;
	int g = 0;
	public void setColor(int r, int g, int b) {
		Color c = new Color(r, g, b);
		controller.SetColor(1, c);
		controller.SetColor(2, c);
		controller.SetColor(3, c);
		controller.SetColor(4, c);
		controller.Update();
	}
	public void breathe() {
		switch(state) {
			case 0:
				b+=3;
				if(b >= 255) state++;
				break;
			case 1:
				r-=3;
				if(r <= 0) state++;
				break;
			case 2:
				g+=3;
				if(g >= 255) state++;
				break;
			case 3:
				b-=3;
				if(b <= 0) state++;
				break;
			case 4:
				r+=3;
				if(r >= 255) state++;
				break;
			case 5:
				g-=3;
				if(g <= 0) state = 0;
				break;
		}
		setColor(r, g, b);
	}
}
