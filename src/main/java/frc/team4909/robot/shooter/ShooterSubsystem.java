package frc.team4909.robot.shooter;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.team4909.robot.shooter.commands.FillTank;

public class ShooterSubsystem extends Subsystem{
    
    public static WPI_TalonSRX AngleMotor;
    public static WPI_VictorSPX solenoid;

    public ShooterSubsystem(){
        AngleMotor = new WPI_TalonSRX(5);
        solenoid = new WPI_VictorSPX(6);
    }

    public void openValve() {
        solenoid.set(1);
    }

    public void closeValve(){
        solenoid.set(0);
    }

    public void raiseShooter(){
        AngleMotor.set(1);
    }

    public void lowerShooter(){
        AngleMotor.set(-1);
    }

    @Override
    protected void initDefaultCommand() {
        //setDefaultCommand(new FillTank(60.0));
    }

}