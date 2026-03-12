package com.example.demo.model;
import java.util.List;

public class Software {
    private String motherBoardVersion;
    private String gsmModuleVersion;
    private List<String> certificates;

    public Software() {}
    
    // Getters and Setters

    public String getMotherBoardVersion() { return motherBoardVersion; }
    public void setMotherBoardVersion(String motherBoardVersion) { this.motherBoardVersion = motherBoardVersion; }

    public String getGsmModuleVersion() { return gsmModuleVersion; }
    public void setGsmModuleVersion(String gsmModuleVersion) { this.gsmModuleVersion = gsmModuleVersion; }

    public List<String> getCertificates() { return certificates; }
    public void setCertificates(List<String> certificates) { this.certificates = certificates; }
}