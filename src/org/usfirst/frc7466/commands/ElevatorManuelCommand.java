package org.usfirst.frc7466.commands;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc7466.OI;
import org.usfirst.frc7466.Robot;

public class ElevatorManuelCommand extends Command {
    double x;
    public ElevatorManuelCommand(double x) {
        requires(Robot.elevatormanuel);
        this.x=x;
    }

    @Override
    protected void initialize() { }

    @Override
    protected void execute() {
        Robot.elevatormanuel.move(x);

    }

    @Override
    protected boolean isFinished() {
        return false;
    }

    @Override
    protected void end() {
        Robot.elevatormanuel.move(0);
    }

    @Override
    protected void interrupted() {
        super.interrupted();
    }
}
