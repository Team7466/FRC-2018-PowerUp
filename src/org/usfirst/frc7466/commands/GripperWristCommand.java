package org.usfirst.frc7466.commands;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc7466.Robot;

public class GripperWristCommand extends Command {
    double x;
    public GripperWristCommand(double x) {
        requires(Robot.gripperwrist);
        this.x = x;

    }
    protected void initialize() { }

    @Override
    protected void execute() {
    Robot.gripperwrist.move(x);
    }

    @Override
    protected boolean isFinished() {
        // TODO: Make this return true when this Command no longer needs to run execute()
        return false;
    }

    @Override
    protected void end() {
        Robot.gripperwrist.move(0);
    }

    @Override
    protected void interrupted() {
        super.interrupted();
    }
}

