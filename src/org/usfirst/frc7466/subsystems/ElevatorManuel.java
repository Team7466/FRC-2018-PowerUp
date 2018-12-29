package org.usfirst.frc7466.subsystems;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc7466.RobotMap;
import org.usfirst.frc7466.commands.ElevatorManuelCommand;

public class ElevatorManuel extends Subsystem {

    public void initDefaultCommand() {

        setDefaultCommand(new ElevatorManuelCommand(0));
    }

    public void move(double x){
        //Motora
        RobotMap.elevatormotor1.set(x);
        RobotMap.elevatormotor2.set(-x);
    }

}
