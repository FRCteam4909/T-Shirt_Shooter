package frc.team4909.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the TimedRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the build.gradle file in the
 * project.
 */
public class Robot extends TimedRobot {

  public static DriveTrain driveTrain;
  public static BionicF310 driveGamepad;


  @Override
  public void robotInit(){
    driveTrain = new DriveTrain();
    driveGamepad = new BionicF310(0, 0.2, 0.6);
  }

  public void robotPeriodic(){

  }

  public void autonomousInit(){

  }

  public void autonomousPeriodic(){

  }

  public void teleopInit(){
    new DriveTrain();
  }

  public void teleopPeriodic(){

  }

  
}
