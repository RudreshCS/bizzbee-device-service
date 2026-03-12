package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;

@Document(collection = "beeboxes")
public class BeeBox {

    @Id
    private String unitId; // MongoDB will use this as the primary key

    private DeviceModel deviceModel;
    private ExternalFrame externalFrame;
    private List<BoxInfo> box;
    private Device device;
    private Accessories accessories;
    private Software software;

    public BeeBox() {}

    // Getters and Setters
    public String getUnitId() { return unitId; }
    public void setUnitId(String unitId) { this.unitId = unitId; }

    public DeviceModel getDeviceModel() { return deviceModel; }
    public void setDeviceModel(DeviceModel deviceModel) { this.deviceModel = deviceModel; }

    public ExternalFrame getExternalFrame() { return externalFrame; }
    public void setExternalFrame(ExternalFrame externalFrame) { this.externalFrame = externalFrame; }

    public List<BoxInfo> getBox() { return box; }
    public void setBox(List<BoxInfo> box) { this.box = box; }

    public Device getDevice() { return device; }
    public void setDevice(Device device) { this.device = device; }

    public Accessories getAccessories() { return accessories; }
    public void setAccessories(Accessories accessories) { this.accessories = accessories; }

    public Software getSoftware() { return software; }
    public void setSoftware(Software software) { this.software = software; }
}