package org.usfirst.frc.team86.robot;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Victor;

public class Drive {
	
	public static RobotDrive robotDrive;
	
	public Drive(Victor leftFrontDrive, Victor leftRearDrive, Victor rightFrontDrive, Victor rightRearDrive) {
		
		robotDrive = new RobotDrive(leftFrontDrive, leftRearDrive, rightFrontDrive, rightRearDrive);
		
	}
	
	public void init() {
		
		robotDrive.tankDrive(0, 0);
		
	}
	
	public void autoUpdate() {
		
		int currState = 1;
		long initialTime = 0;
		
		switch (currState) {
			
		case 1: 
			initialTime = System.currentTimeMillis();
			currState++;
			break;
		case 2: 
			while (System.currentTimeMillis() < initialTime + 3000) {
				robotDrive.tankDrive(.5, .5);
			}
			currState++;
			break;
		case 3: 
			while (System.currentTimeMillis() < initialTime + 2500) {
				robotDrive.tankDrive(.25, -.25);
			}
			currState++;
			break;
		case 4:
			while (System.currentTimeMillis() < initialTime + 3000) {
				robotDrive.tankDrive(-.5, -.5);
			}
			break;
		default: robotDrive.tankDrive(0, 0);
		}
		
	}
	
	public void teleopUpdate() {
		
		robotDrive.tankDrive(IO.leftStick.getY(), IO.rightStick.getY());
		
	}

}
