/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/
package org.usfirst.frc7466;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import org.usfirst.frc7466.commands.*;

public class OI
{
    //Birinci Joystick Tanımlamaları
    public static Joystick primary = new Joystick(0);
    Button A1 = new JoystickButton(primary,1);
    Button B1 = new JoystickButton(primary,2);
    Button X1 = new JoystickButton(primary,3);
    Button Y1 = new JoystickButton(primary,4);
    Button LB1 = new JoystickButton(primary,5);
    Button RB1 = new JoystickButton(primary,6);
    Button BCK1 = new JoystickButton(primary,7);
    Button SRT1 = new JoystickButton(primary,8);
    Button PRSL1 = new JoystickButton(primary,9);
    Button PRSR1 = new JoystickButton(primary,10);

    //İkinci Joystick Tanımlamaları
    public static Joystick secondary = new Joystick(1);
    Button A2 = new JoystickButton(secondary,1);
    Button B2 = new JoystickButton(secondary,2);
    Button X2 = new JoystickButton(secondary,3);
    Button Y2 = new JoystickButton(secondary,4);
    Button LB2 = new JoystickButton(secondary,5);
    Button RB2 = new JoystickButton(secondary,6);
    Button BCK2 = new JoystickButton(secondary,7);
    Button SRT2 = new JoystickButton(secondary,8);
    //Button PRSL2 = new JoystickButton(secondary,9);
    //Button PRSR2 = new JoystickButton(secondary,10);

    OI(){
        //Motor Buton İlişkileri
        RB2.whileHeld(new ElevatorEncoder(Robot.cymurghsVp.ScalePid));
        LB2.whileHeld(new ElevatorEncoder(-Robot.cymurghsVp.ScalePid));
        SRT2.whileHeld(new LedCommand());
        A2.whileHeld(new ElevatorManuelCommand(1));
        B2.whileHeld(new ElevatorManuelCommand(-1));
        X2.whileHeld(new GripperClawCommand(1,1));
        Y2.whileHeld(new GripperClawCommand(-1,1));
        RB2.whileHeld(new GripperWristCommand(1));
        LB2.whileHeld(new GripperWristCommand(-1));

        /*if (secondary.getPOV() == 0){
            new ElevatorManuelCommand(1);
        }
        else if(secondary.getPOV() == 180){
            new ElevatorManuelCommand(-1);
        }
        else{
            new ElevatorManuelCommand(0);
    }*/
    }
}
