package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
@Disabled
@TeleOp
public class VariablePractice extends OpMode {
    @Override
    public void init() {
        int teamNumber = 23014;
        double motorSpeed = .75;
        boolean clawClosed = true;
        String name = "Neko";
        int motorAngle = 90;

        telemetry.addData("Team Number", teamNumber);
        telemetry.addData("motor speed", motorSpeed);
        telemetry.addData("Claw Closed", clawClosed);
        telemetry.addData("Name", name);
        telemetry.addData("Motor Angle", motorAngle);

    }

    @Override
    public void loop() {
        /*
        1. change the String variable "name" to your team name.
        2. create an int called "motorAngle" and store an angle between 0 - 100. display in init method.
         */

    }
}
