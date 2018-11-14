package org.usfirst.frc7466.subsystems;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class CymurghsVp extends Subsystem {
    public static double ScalePid;
    public void initDefaultCommand() {

        //CymurghsVp üzerinden gelen veriyi çeker.
        double mAngle = SmartDashboard.getNumber("scaleAngle", Double.NaN);

        //Açı değerini scale uzunluğu ile çarpıp tambur çapına böler.
        double DR= (Math.sin(mAngle)*228.6)/7.6;

        //Scale orta dikey uzunluğunu hesaplar.
        double DH= 152.4/7.6;
        ScalePid = DH+DR;
    }
}