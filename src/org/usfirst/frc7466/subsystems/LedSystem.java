package org.usfirst.frc7466.subsystems;

import edu.wpi.first.wpilibj.SerialPort;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc7466.OI;
import org.usfirst.frc7466.Robot;
import org.usfirst.frc7466.RobotMap;

import static org.usfirst.frc7466.OI.secondary;

public class LedSystem extends Subsystem {

    public void initDefaultCommand() {

    }
    public void changeMode (String x){
        RobotMap.arduino.writeString(x);
    }
}

