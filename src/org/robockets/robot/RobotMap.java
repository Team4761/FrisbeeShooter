package org.robockets.robot;

import edu.wpi.first.wpilibj.*;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	public static Victor frontLeft = new Victor(1);
	public static Victor frontRight = new Victor(5);
	public static Victor backLeft = new Victor(0);
	public static Victor backRight = new Victor(3);

	public static Victor shooterTop = new Victor(2);
	public static Victor shooterBottom = new Victor(4);

	public static Victor flapperServo = new Victor(6);

	public static RobotDrive robotDrive = new RobotDrive(frontLeft, backLeft, frontRight, backRight);
}
