package org.usfirst.frc7466.subsystems;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.PWMVictorSPX;
import org.usfirst.frc7466.RobotMap;
import edu.wpi.first.wpilibj.command.PIDSubsystem;

public class ElevatorSystem extends PIDSubsystem {
    PWMVictorSPX elevatormotor1 = RobotMap.elevatormotor1;
    PWMVictorSPX elevatormotor2 = RobotMap.elevatormotor2;
    Encoder encoder= RobotMap.Encoder1;

    public ElevatorSystem() {
        super("Wrist",0.08, 0.05, 0.05);
        setAbsoluteTolerance(0.1);
        getPIDController().setContinuous(false);
        // enable() - Enables the PID controller.
    }


    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }


    protected double returnPIDInput() {
        // Return your input value for the PID loop
        // e.g. a sensor, like a potentiometer:
        // yourPot.getAverageVoltage() / kYourMaxVoltage;
        return encoder.getDistance();
    }


    protected void usePIDOutput(double output) {
        // Use output to drive your system, like a motor
        // e.g. yourMotor.set(output);
        elevatormotor1.pidWrite(-output);
        elevatormotor2.pidWrite(-output);
    }
}
