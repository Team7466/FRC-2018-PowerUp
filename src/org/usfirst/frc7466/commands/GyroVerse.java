package org.usfirst.frc7466.commands;
import org.usfirst.frc7466.Robot;
import edu.wpi.first.wpilibj.command.TimedCommand;
import org.usfirst.frc7466.RobotMap;

public class GyroVerse extends TimedCommand {
	boolean x;
    public GyroVerse(double timeout, boolean x) {
        super(timeout);
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        requires(Robot.driveSystem);
        this.x=x;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	RobotMap.gyro.reset();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.driveSystem.GyroDrive((RobotMap.gyro),x);
    }

    // Called once after timeout
    protected void end() {
    	Robot.driveSystem.drive(0,0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}