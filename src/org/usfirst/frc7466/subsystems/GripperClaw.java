package org.usfirst.frc7466.subsystems;


import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc7466.RobotMap;
import org.usfirst.frc7466.commands.GripperClawCommand;;

public class GripperClaw extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.


    public void initDefaultCommand() {

        setDefaultCommand(new GripperClawCommand(0,0));
    }
    public void move(double x){
        RobotMap.Clawmotor.set(x);
    }
}

