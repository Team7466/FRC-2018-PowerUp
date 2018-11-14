package org.usfirst.frc7466.commands;
import org.usfirst.frc7466.Robot;
import edu.wpi.first.wpilibj.command.TimedCommand;

public class GripperClawCommand extends TimedCommand {
double x;
double timeout;
    public GripperClawCommand(double x,double timeout) {
        super(timeout);
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.gripperClaw);
    	this.x=x;
        this.timeout=timeout;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    Robot.gripperClaw.move(x);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.gripperClaw.move(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
