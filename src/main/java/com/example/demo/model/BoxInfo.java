package com.example.demo.model;

public class BoxInfo {
    private String boxId;
    private String temperatureSensorId;
    private String weightSensorId;
    private String acceleroSensorId;
    private String microphoneId;
    private String humiditySensorId;

    public BoxInfo() {}

    public String getBoxId() { return boxId; }
    public void setBoxId(String boxId) { this.boxId = boxId; }

    public String getTemperatureSensorId() { return temperatureSensorId; }
    public void setTemperatureSensorId(String temperatureSensorId) { this.temperatureSensorId = temperatureSensorId; }

    public String getWeightSensorId() { return weightSensorId; }
    public void setWeightSensorId(String weightSensorId) { this.weightSensorId = weightSensorId; }

    public String getAcceleroSensorId() { return acceleroSensorId; }
    public void setAcceleroSensorId(String acceleroSensorId) { this.acceleroSensorId = acceleroSensorId; }

    public String getMicrophoneId() { return microphoneId; }
    public void setMicrophoneId(String microphoneId) { this.microphoneId = microphoneId; }

    public String getHumiditySensorId() { return humiditySensorId; }
    public void setHumiditySensorId(String humiditySensorId) { this.humiditySensorId = humiditySensorId; }
}