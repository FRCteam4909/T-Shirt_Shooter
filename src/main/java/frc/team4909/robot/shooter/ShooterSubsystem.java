package frc.team4909.robot.shooter;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

public class ShooterSubsystem extends Subsystem{
    
    public static WPI_TalonSRX AngleMotor;
    public static Solenoid solenoid;

    public ShooterSubsystem(){
        AngleMotor = new WPI_TalonSRX(5);
        solenoid = new Solenoid(1);
    }

    public void openValve() {
        solenoid.set(true);
    }

    public void closeValve(){
        solenoid.set(false);
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