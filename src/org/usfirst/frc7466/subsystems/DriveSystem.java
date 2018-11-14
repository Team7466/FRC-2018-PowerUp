package org.usfirst.frc7466.subsystems;
import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.Timer;
import org.usfirst.frc7466.RobotMap;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc7466.commands.DriveCommand;

public class DriveSystem extends Subsystem {
    private final double Kp = 0.04;
    public void initDefaultCommand() {
         setDefaultCommand(new DriveCommand(0));
    }
    public void drive(double x,double y) {
        RobotMap.driveSystem.tankDrive(x, y);
    }
    public void drivefunc(Joystick joy,double mult) {
        drive(joy.getRawAxis(1)*-mult , joy.getRawAxis(5)*-mult );
    }

    public void GyroDrive(ADXRS450_Gyro gyro,boolean x) {
        double angle = gyro.getAngle();
        if(x) {
            drive((0.7-angle*Kp),(0.7+angle*Kp));
        }
        else {
            drive(-(angle*Kp+0.5),-(0.5-angle*Kp));
        }
        Timer.delay(0.0004);
    }

    public void GyroTurn(ADXRS450_Gyro gyro, double turn) {
        double angle = gyro.getAngle();
        double power=(turn-angle)*Kp*8;
        if (power>=0.7)
        {
            power=0.7;
        }
        else if(power>0) {
            power= 0.5;
        }
        else if(power <= -0.7) {
            power= -0.7;
        }
        else {
            power= -0.5;
        }
        Timer.delay(0.0004);
        drive(power,-power);
    }
}