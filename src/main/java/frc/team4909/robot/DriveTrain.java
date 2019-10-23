package frc.team4909.robot;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class DriveTrain extends Subsystem {

   WPI_TalonSRX f_right;
    WPI_TalonSRX f_left;
    WPI_TalonSRX b_right;
    WPI_TalonSRX b_left;
    DifferentialDrive bionicDrive;
    SpeedControllerGroup left;
    SpeedControllerGroup right;

    public DriveTrain(){

        f_right = new WPI_TalonSRX(0);
        f_left = new WPI_TalonSRX(1);
        
        left = new SpeedControllerGroup(f_left, b_left);
        right = new SpeedControllerGroup(f_right, b_right);
        bionicDrive = new DifferentialDrive(left, right);

    } 

    public void tankDrive(double left, double right){
bionicDrive.tankDrive(left, right);
    }

    public void arcadeDrive(double speed, double rotation){
bionicDrive.arcadeDrive(speed, rotation);
    
    }
@Override
	protected void initDefaultCommand() {
		
    }
}
