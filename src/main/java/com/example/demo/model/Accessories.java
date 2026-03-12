package com.example.demo.model;
import java.util.List;

public class Accessories {
    private List<String> battery_charger; // No @ElementCollection needed!
    private String powerAdopter;
    private String jacket;
    private String mask;
    private String blower;

    public Accessories() {}

    // Getters and Setters

    public List<String> getBattery_charger() { return battery_charger; }
    public void setBattery_charger(List<String> battery_charger) { this.battery_charger = battery_charger; }

    public String getPowerAdopter() { return powerAdopter; }
    public void setPowerAdopter(String powerAdopter) { this.powerAdopter = powerAdopter; }

    public String getJacket() { return jacket; }
    public void setJacket(String jacket) { this.jacket = jacket; }

    public String getMask() { return mask; }
    public void setMask(String mask) { this.mask = mask; }

    public String getBlower() { return blower; }
    public void setBlower(String blower) { this.blower = blower; }
}