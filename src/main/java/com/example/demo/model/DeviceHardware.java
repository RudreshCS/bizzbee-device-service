package com.example.demo.model;

public class DeviceHardware { 
    private String deviceId;
    private String externalTemparatureId;
    private String rainfallSensorId;
    private String antenna_4G;
    private String antenna_gps;
    private SimCardDetails simCardDetails; 

    public DeviceHardware() {}

    public String getDeviceId() { return deviceId; }
    public void setDeviceId(String deviceId) { this.deviceId = deviceId; }

    public String getExternalTemparatureId() { return externalTemparatureId; }
    public void setExternalTemparatureId(String externalTemparatureId) { this.externalTemparatureId = externalTemparatureId; }

    public String getRainfallSensorId() { return rainfallSensorId; }
    public void setRainfallSensorId(String rainfallSensorId) { this.rainfallSensorId = rainfallSensorId; }

    public String getAntenna_4G() { return antenna_4G; }
    public void setAntenna_4G(String antenna_4G) { this.antenna_4G = antenna_4G; }

    public String getAntenna_gps() { return antenna_gps; }
    public void setAntenna_gps(String antenna_gps) { this.antenna_gps = antenna_gps; }

    public SimCardDetails getSimCardDetails() { return simCardDetails; }
    public void setSimCardDetails(SimCardDetails simCardDetails) { this.simCardDetails = simCardDetails; }
}