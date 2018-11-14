package org.usfirst.frc7466.commands;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc7466.Robot;
import org.usfirst.frc7466.RobotMap;


public class ElevatorEncoder extends Command {

    double x;
    public ElevatorEncoder(double x) {
      this.x=x;
      requires(Robot.ElevatorSystem);
    }

    @Override
    protected void initialize() {
        Robot.ElevatorSystem.enable();
    }

    @Override
    protected void execute() {
        double tour = x;
        double setpoint = 360*tour;
        Robot.ElevatorSystem.setSetpoint(setpoint);
    }

    @Override
    protected boolean isFinished() {
        // TODO: Make this return true when this Command no longer needs to run execute()
        Timer.delay(1);
            if (RobotMap.Encoder1.getStopped()){
            return true;
        }
        else {
            return false;
        }

        }

    @Override
    protected void end() {
        Robot.ElevatorSystem.disable();
    }

    @Override
    protected void interrupted() {
        super.interrupted();
    }
}
