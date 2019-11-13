package frc.team4909.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.team4909.robot.drivetrain.Drivetrain;
import frc.team4909.robot.shooter.ShooterSubsystem;
import frc.team4909.robot.shooter.commands.LowerShooter;
import frc.team4909.robot.shooter.commands.RaiseShooter;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the TimedRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the build.gradle file in the
 * project.
 */
public class Robot extends TimedRobot {
  public static Drivetrain drivetrain;
  public static ShooterSubsystem shooter;

  public static BionicF310 driveGamepad;

  @Override
  public void robotInit(){
    drivetrain = new Drivetrain();
    shooter = new ShooterSubsystem();

    driveGamepad = new BionicF310(0, 0.2, 0.6);

    driveGamepad.povActive(BionicF310.Top, new RaiseShooter());;
    driveGamepad.povActive(BionicF310.Bottom, new LowerShooter());;
  }

  public void robotPeriodic(){

  }

  public void autonomousInit(){

  }

  public void autonomousPeriodic(){

  }

  public void teleopInit(){

  }

  public void teleopPeriodic(){

  }

  
}
