package frc.team4909.robot;

import edu.wpi.first.wpilibj.command.Command;

public class Drive extends Command {

    public Drive() {
        
        requires(Robot.driveTrain);
    }

    public void execute() {
        Robot.driveTrain.arcadeDrive(Robot.driveGamepad.getThresholdAxis(BionicF310.LY), Robot.driveGamepad.getThresholdAxis(BionicF310.RX));
    }
    protected boolean isFinished() {
        
        return false;
    }

}