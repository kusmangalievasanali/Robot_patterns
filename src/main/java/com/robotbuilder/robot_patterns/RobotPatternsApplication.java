package com.robotbuilder.robot_patterns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RobotPatternsApplication {

    public static void main(String[] args) {
        Robot robotCleaner = new RobotBuilder()
                .setModelName("Tazadom")
                .setChassisType("track")
                .setBatteryModel("Barys")
                .setBatteryCapacity(100)
                .setHasManipulator(true)
                .setPrimarySensor("Ultrasonic")
                .build();


        System.out.println("___RobotCleaner___");
        System.out.println(robotCleaner);


        //With director
        RobotDirector director = new RobotDirector();

        Robot explorer = director.constructExplorerRobot(new RobotBuilder());
        System.out.println("___Explorer Robot by director___");
        System.out.println(explorer);


        Robot delivery = director.constructDeliveryRobot(new RobotBuilder());
        System.out.println("___Delivery Robot by director___");
        System.out.println(delivery);





    }



}
