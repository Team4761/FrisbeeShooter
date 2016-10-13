package org.robockets.frisbeeshooter.robot;

import edu.wpi.first.wpilibj.RobotDrive;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	public static RobotDrive robotDrive = new RobotDrive(1,2,3,4); 
	// Shooter moters: top, 4; bottom, 6; flipper, 5 
}
