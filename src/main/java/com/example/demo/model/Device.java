package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;

@Document(collection = "devices") 
public class Device { 

    @Id
    private String unitId; 

    private DeviceModel deviceModel;
    private ExternalFrame externalFrame;
    private List<BoxInfo> box;
    
    private DeviceHardware deviceHardware; 
    
    private Accessories accessories;
    private Software software;

    public Device() {}

    public String getUnitId() { return unitId; }
    public void setUnitId(String unitId) { this.unitId = unitId; }

    public DeviceModel getDeviceModel() { return deviceModel; }
    public void setDeviceModel(DeviceModel deviceModel) { this.deviceModel = deviceModel; }

    public ExternalFrame getExternalFrame() { return externalFrame; }
    public void setExternalFrame(ExternalFrame externalFrame) { this.externalFrame = externalFrame; }

    public List<BoxInfo> getBox() { return box; }
    public void setBox(List<BoxInfo> box) { this.box = box; }

    public DeviceHardware getDeviceHardware() { return deviceHardware; }
    public void setDeviceHardware(DeviceHardware deviceHardware) { this.deviceHardware = deviceHardware; }

    public Accessories getAccessories() { return accessories; }
    public void setAccessories(Accessories accessories) { this.accessories = accessories; }

    public Software getSoftware() { return software; }
    public void setSoftware(Software software) { this.software = software; }
}