package org.usfirst.frc7466.commands;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc7466.OI;
import org.usfirst.frc7466.Robot;
import org.usfirst.frc7466.RobotMap;
import edu.wpi.first.wpilibj.Joystick;

public class DriveCommand extends Command {
    double x;
    public DriveCommand(double x) {
        requires(Robot.driveSystem);
        this.x=x;
    }

    @Override
    protected void initialize() { }

    @Override
    protected void execute() {

        Robot.driveSystem.drivefunc(OI.primary, 0.6);

    }

    @Override
    protected boolean isFinished() {
        // TODO: Make this return true when this Command no longer needs to run execute()
        return false;
    }

    @Override
    protected void end() { }

    @Override
    protected void interrupted() {
        super.interrupted();
    }
}
