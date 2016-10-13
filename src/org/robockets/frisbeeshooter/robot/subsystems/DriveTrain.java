package org.robockets.frisbeeshooter.robot.subsystems;

import org.robockets.frisbeeshooter.robot.Robot;
import org.robockets.frisbeeshooter.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrain extends Subsystem {
    
      public void initDefaultCommand() {
      
      }
      
      public void takeJoystickInput(double left, double right, double twist) {
    	  RobotMap.robotDrive.mecanumDrive_Cartesian(left, right, twist, 0); // NO GYRO!!!
      }
      
      public void stop() {
    	  RobotMap.robotDrive.mecanumDrive_Cartesian(0, 0, 0, 0);
      }
}

