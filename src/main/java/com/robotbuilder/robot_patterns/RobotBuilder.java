package com.robotbuilder.robot_patterns;

public class RobotBuilder {
    private String modelName;
    private String chassisType;
    private String batteryModel;
    private int batteryCapacity;
    private boolean hasManipulator;
    private String primarySensor;

    public RobotBuilder setModelName(String modelName){
        this.modelName = modelName;
        return this;
    }
    public RobotBuilder setChassisType(String chassisType) {
        this.chassisType = chassisType;
        return this;
    }

    public RobotBuilder setBatteryModel(String batteryModel) {
        this.batteryModel = batteryModel;
        return this;
    }

    public RobotBuilder setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
        return this;
    }

    public RobotBuilder setHasManipulator(boolean hasManipulator) {
        this.hasManipulator = hasManipulator;
        return this;
    }

    public RobotBuilder setPrimarySensor(String primarySensor) {
        this.primarySensor = primarySensor;
        return this;
    }

    public String getModelName() { return modelName; }
    public String getChassisType() { return chassisType; }
    public String getBatteryModel() { return batteryModel; }
    public int getBatteryCapacity() { return batteryCapacity; }
    public boolean isHasManipulator() { return hasManipulator; }
    public String getPrimarySensor() { return primarySensor; }

    public Robot build() {
        if (modelName == null) {
            throw new IllegalStateException("Model of robot is mandatory!");
        }
        if (batteryCapacity <= 0) {
            throw new IllegalStateException("Capacity has to be grather than 0!");
        }
        return  new Robot(this);
    }

}

