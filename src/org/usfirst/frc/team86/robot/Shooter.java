package org.usfirst.frc.team86.robot;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

public class Shooter {
	
	// Instance variables
	private Victor shooter;
	private Victor conveyor; 
	private Victor agitator;
	private Victor vibrator;
	private Victor snorfler;
	
	// Joysticks
	private JoystickButton buttonOne;
	private JoystickButton buttonThree;
	private JoystickButton buttonFive;
	
	
	
	public Shooter(Victor shooter, Victor conveyor, Victor agitator, Victor vibrator, Victor snorfler, 
			JoystickButton buttonOne, JoystickButton buttonThree, JoystickButton buttonFive) {
		
		this.shooter = shooter;
		this.conveyor = conveyor;
		this.agitator = agitator; 
		this.vibrator = vibrator;
		this.snorfler = snorfler; 
		this.buttonOne = buttonOne;
		this.buttonThree = buttonThree;
		this.buttonFive = buttonFive;
		
	}
	
	public void init() {
		
		// Set all speeds to zero on start
		shooter.set(0);	
		conveyor.set(0);	
		agitator.set(0);	
		vibrator.set(0);	
		snorfler.set(0);	
	}
	
	public void update() {
		
		if (buttonOne.get()) {
			shooter.set(.65);
			conveyor.set(1);
			agitator.set(0);
			vibrator.set(0);
		}
		else if (buttonOne.get() && buttonThree.get()) {
			shooter.set(.65);
			conveyor.set(1);
			agitator.set(-.3);
			vibrator.set(.5);
		}
		else {
			shooter.set(0);	
			conveyor.set(0);	
			agitator.set(0);	
			vibrator.set(0);	
			snorfler.set(0);	
		}
		
		if (buttonFive.get()) {
			snorfler.set(.25);
		}
		else {
			snorfler.set(0);
		}
		
		
	}

}
