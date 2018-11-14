package org.usfirst.frc7466.subsystems;


import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc7466.RobotMap;
import org.usfirst.frc7466.commands.GripperWristCommand;

public class GripperWrist extends Subsystem {

    public void initDefaultCommand() {
        setDefaultCommand(new GripperWristCommand(0));
        // TODO: Set the default command, if any, for a subsystem here. Example:
        //    setDefaultCommand(new MySpecialCommand());
    }
    public void move(double x){
        RobotMap.wristmotor.set(x);
    }
}

