package com.robotbuilder.robot_patterns;

public class Robot {
    private final String modelName;
    private final String chassisType;
    private final String batteryModel;
    private final int batteryCapacity;
    private final boolean hasManipulator;
    private final String primarySensor;

    public Robot(RobotBuilder builder) {
        this.modelName = builder.getModelName();
        this.chassisType = builder.getChassisType();
        this.batteryModel = builder.getBatteryModel();
        this.batteryCapacity = builder.getBatteryCapacity();
        this.hasManipulator = builder.isHasManipulator();
        this.primarySensor = builder.getPrimarySensor();
    }

    public String getModelName() {
        return modelName;
    }

    public String getChassisType() {
        return chassisType;
    }

    public String getBatteryModel() {
        return batteryModel;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public boolean hasManipulator() {
        return hasManipulator;
    }

    public String getPrimarySensor() {
        return primarySensor;
    }

    @Override
    public String toString() {
        return "Robot Configuration:\n" +
                "Model Name: " + modelName + "\n" +
                "Chassis Type: " + chassisType + "\n" +
                "Battery Model: " + batteryModel + "\n" +
                "Battery Capacity: " + batteryCapacity + "\n" +
                "Has Manipulator: " + hasManipulator + "\n" +
                "Primary Sensor: " + primarySensor + "\n";
    }

}
