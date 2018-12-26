package frc.team2410.robot.Subsystems;

import com.mach.LightDrive.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import static frc.team2410.robot.RobotMap.*;

public class LED {
	LightDriveCAN controller;
	
	public LED() {
		controller = new LightDriveCAN();
	}
	
	int state = 0;
	double r, g, b;
	
	public void setColor(double r, double g, double b) {
		Color c = new Color((int)r, (int)g, (int)b);
		this.r = r;
		this.g = g;
		this.b = b;
		controller.SetColor(1, c);
		controller.SetColor(2, c);
		controller.SetColor(3, c);
		controller.SetColor(4, c);
		controller.Update();
	}
	
	public void fade() {
		switch(state) {
			case 0:
				b += 3;
				if(b >= 255) state++;
				break;
			case 1:
				r -= 3;
				if(r <= 0) state++;
				break;
			case 2:
				g += 3;
				if(g >= 255) state++;
				break;
			case 3:
				b -= 3;
				if(b <= 0) state++;
				break;
			case 4:
				r += 3;
				if(r >= 255) state++;
				break;
			case 5:
				g -= 3;
				if(g <= 0) state = 0;
				break;
		}
		setColor(r, g, b);
	}
	
	public void breathe(int r0, int g0, int b0, int r1, int g1, int b1) {
		double ri = (r1-r0)/85.0;
		double gi = (g1-g0)/85.0;
		double bi = (b1-b0)/85.0;
		if((r >= (r0 > r1 ? r0 : r1) || r <= (r0 < r1 ? r0 : r1)) && (g >= (g0 > g1 ? g0 : g1) || g <= (g0 < g1 ? g0 : g1)) && (b >= (b0 > b1 ? b0 : b1) || b <= (b0 < b1 ? b0 : b1))) {
			state = state == 1 ? 0 : 1;
			SmartDashboard.putNumber(""+Math.random(), 1);
		}
		r += ri*((state*2)-1);
		g += gi*((state*2)-1);
		b += bi*((state*2)-1);
		setColor(r, g, b);
	}
}
