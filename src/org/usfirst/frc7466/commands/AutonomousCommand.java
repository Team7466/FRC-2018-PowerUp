package org.usfirst.frc7466.commands;
import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.command.CommandGroup;
public class AutonomousCommand extends CommandGroup {

    public AutonomousCommand() {


   /*
                        addSequential(new GripperClawCommand(0.6,1), 0.3);
                        addSequential(new GyroVerse(6, false));
                        addSequential(new GyroTurn(90));
                        addSequential(new GyroVerse(1, false));
                        addSequential(new RemGripperTimed(1,-0.5));
                        addSequential(new GripClawCommand(-0.6));
                        addSequential(new GyroVerse(0.3,false));
                        addSequential(new GyroVerse(0.3,true));
*/
        if (DriverStation.getInstance().getGameSpecificMessage().charAt(0) == 'L') {
            addSequential(new GyroVerse(1.7, true));
            addSequential(new GripperClawCommand(-1, 0.5), 0.5);
            addSequential(new GripperWristCommand(1), 0.5);

        }
        else{
            addSequential(new GyroVerse(1.7, true));
        }
    }
}