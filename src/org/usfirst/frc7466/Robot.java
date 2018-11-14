/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/
package org.usfirst.frc7466;
import edu.wpi.first.wpilibj.SerialPort;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import org.usfirst.frc7466.commands.AutonomousCommand;
import org.usfirst.frc7466.subsystems.*;
import org.usfirst.frc7466.util.Camera;

// If you rename or move this class, update the build.properties file in the project root
public class Robot extends TimedRobot 
{
    public static GripperClaw gripperClaw;
    public static OI oi;
    public static GripperWrist gripperwrist;
    public static ElevatorManuel elevatormanuel;
    public static DriveSystem driveSystem;
    public static org.usfirst.frc7466.subsystems.ElevatorSystem ElevatorSystem;
    public static CymurghsVp cymurghsVp;
    public static Camera usbCamera;
    public static LedSystem ledSystem;
    private Command autonomousCommand;
    private SendableChooser<Command> chooser = new SendableChooser<>();
    public static SerialPort serial;
    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    @Override
    public void robotInit() 
    {
        usbCamera = new Camera();
        SmartDashboard.putNumber("Encoder", RobotMap.Encoder1.getDistance());
        ElevatorSystem = new ElevatorSystem();
        cymurghsVp = new CymurghsVp();
        elevatormanuel = new ElevatorManuel();
        gripperwrist = new GripperWrist();
        driveSystem = new DriveSystem();
        gripperClaw = new GripperClaw();
        ledSystem = new LedSystem();
        oi = new OI();
        RobotMap.gyro.calibrate();
        RobotMap.Encoder1.setMaxPeriod(.1);
        RobotMap.Encoder1.setMinRate(300);
        RobotMap.Encoder1.setReverseDirection(true);
        RobotMap.Encoder1.setSamplesToAverage(7);
        RobotMap.Encoder1.setDistancePerPulse(0.62931);
    }

    @Override
    public void disabledInit() { }
    @Override
    public void disabledPeriodic() 
    {
        Scheduler.getInstance().run();
    }
    @Override
    public void autonomousInit() {
        new AutonomousCommand().start();


        /*
         * String autoSelected = SmartDashboard.getString("Auto Selector",
         * "Default"); switch(autoSelected) { case "My Auto": autonomousCommand
         * = new MyAutoCommand(); break; case "Default Auto": default:
         * autonomousCommand = new ExampleCommand(); break; }
         */

        // schedule the autonomous command (example)
    }

    @Override
    public void autonomousPeriodic() 
    {
        Scheduler.getInstance().run();
    }

    @Override
    public void teleopInit() 
    {
        Scheduler.getInstance().run();
        // This makes sure that the autonomous stops running when
        // teleop starts running. If you want the autonomous to
           // continue until interrupted by another command, remove

    }

    @Override
    public void teleopPeriodic() 
    {
        Scheduler.getInstance().run();
        //SmartDashboard.putNumber("Pov",OI.primary.getPOV());
    }

    @Override
    public void testPeriodic() { }
}
