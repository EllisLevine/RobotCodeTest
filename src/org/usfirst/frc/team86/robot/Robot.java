
package org.usfirst.frc.team86.robot;

import edu.wpi.first.wpilibj.IterativeRobot;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {
   
	public Shooter shooter;
	public Drive drive;
	
    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
    	
    	shooter = new Shooter(IO.shooter, IO.conveyor, IO.agitator, IO.vibrator, IO.snorfler, IO.buttonOne, IO.buttonThree, IO.buttonFive);
    	drive = new Drive(IO.leftFrontDrive, IO.leftRearDrive, IO.rightFrontDrive, IO.rightRearDrive);
    	shooter.init();
    	drive.init();
        
    }
    
	/**
	 * This autonomous (along with the chooser code above) shows how to select between different autonomous modes
	 * using the dashboard. The sendable chooser code works with the Java SmartDashboard. If you prefer the LabVIEW
	 * Dashboard, remove all of the chooser code and uncomment the getString line to get the auto name from the text box
	 * below the Gyro
	 *
	 * You can add additional auto modes by adding additional comparisons to the switch structure below with additional strings.
	 * If using the SendableChooser make sure to add them to the chooser code above as well.
	 */
    public void autonomousInit() {
  
    	
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
    	
    	drive.autoUpdate();
    	
    }
    
    public void teleopInit() {
 
    	
    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        
    	shooter.update();
    	drive.teleopUpdate();
    	
    }
    
    
    public void testPeriodic() {
    	
    	
    }
    
}
