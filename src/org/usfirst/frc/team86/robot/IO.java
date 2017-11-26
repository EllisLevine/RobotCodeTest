package org.usfirst.frc.team86.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

public class IO {
	
	// Shooting Motors
	public static Victor shooter = new Victor(0);
	public static Victor conveyor = new Victor(1);
	public static Victor agitator = new Victor(2);
	public static Victor vibrator = new Victor(3);
	public static Victor snorfler = new Victor(4);
	
	// Drive Motors
	public static Victor leftFrontDrive = new Victor(5);
	public static Victor leftRearDrive = new Victor(6);
	public static Victor rightFrontDrive = new Victor(7);
	public static Victor rightRearDrive = new Victor(8);
	
	// Joysticks 
	public static Joystick leftStick = new Joystick(0);
	public static Joystick rightStick = new Joystick(1);
	public static Joystick coStick = new Joystick(2);
	
	public static JoystickButton buttonOne = new JoystickButton(coStick, 1);
	public static JoystickButton buttonThree = new JoystickButton(coStick, 3);
	public static JoystickButton buttonFive = new JoystickButton(coStick, 5);
	
	
	public void init() {
		
		// One side of the motors must be inverted to travel forward/backwards
		IO.rightRearDrive.setInverted(true);
		IO.rightFrontDrive.setInverted(true);
		
	}
	
	
	

}
