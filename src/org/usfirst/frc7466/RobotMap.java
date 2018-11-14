/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc7466;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */

public class RobotMap
{
    public static Encoder Encoder1 = new Encoder(9, 8, true, Encoder.EncodingType.k4X);
    public static ADXRS450_Gyro gyro = new ADXRS450_Gyro();
    public static SpeedController Clawmotor = new PWMVictorSPX(6);
    public static PWMVictorSPX elevatormotor1 = new PWMVictorSPX(2);
    public static PWMVictorSPX elevatormotor2 = new PWMVictorSPX(5);
    public static PWMVictorSPX wristmotor = new PWMVictorSPX(7);
    public static SpeedController leftMotor1 = new Victor(4);
    public static SpeedController leftMotor2 = new Victor(3);
    public static SpeedController rightMotor1 = new Victor(0);
    public static SpeedController rightMotor2 = new Victor(1);

    //Drive Motorları
    public static SpeedController left= new SpeedControllerGroup(leftMotor1,leftMotor2);
    public static SpeedController right= new SpeedControllerGroup(rightMotor1,rightMotor2);
    public static DifferentialDrive driveSystem = new DifferentialDrive(left,right);

    public static SerialPort arduino = new SerialPort(9600,SerialPort.Port.kUSB1);

}
