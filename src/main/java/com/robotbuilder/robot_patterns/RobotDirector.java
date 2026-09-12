package com.robotbuilder.robot_patterns;

public class RobotDirector {
    public Robot constructExplorerRobot(RobotBuilder builder){
        return builder
                .setModelName("Izuchy001")
                .setChassisType("Wheels")
                .setBatteryModel("Li-Ion")
                .setBatteryCapacity(80)
                .setHasManipulator(false)
                .setPrimarySensor("Lidar")
                .build();

    }

    public Robot constructDeliveryRobot(RobotBuilder builder){
        return builder
                .setModelName("Zhyldam1")
                .setChassisType("WheelsUltra")
                .setBatteryModel("Li-Ion")
                .setBatteryCapacity(98)
                .setHasManipulator(true)
                .setPrimarySensor("Camera")
                .build();
    }
}
