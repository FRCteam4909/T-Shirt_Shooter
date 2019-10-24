package frc.team4909.robot.shooter;

import edu.wpi.first.wpilibj.command.Command;
import frc.team4909.robot.Robot;

public class FillTank extends Command {

    private double targetPSI;

    public FillTank(double target) {
        requires(Robot.shooter);
        targetPSI = target;
    }

    @Override
    protected void execute() {
        Robot.shooter.fillMain();
    }

    @Override
    protected boolean isFinished() {
        if (Robot.shooter.currentPSI() <= targetPSI + 1 && Robot.shooter.currentPSI() >= targetPSI - 1) {
            Robot.shooter.closeMain();
            return true;
        }
        return false;
    }

}