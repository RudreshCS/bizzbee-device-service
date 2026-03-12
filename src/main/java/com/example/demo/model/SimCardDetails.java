package com.example.demo.model;

public class SimCardDetails {
    private String serviceProvider;
    private String status;
    private String lastRechargeDate;
    private String rechargeDueDate;
    private String number;
    private String imeiNumber;
    private String buyDate;
    private String dataPackPlan;

    public SimCardDetails() {}

    // Getters and Setters

    public String getServiceProvider() { return serviceProvider; }
    public void setServiceProvider(String serviceProvider) { this.serviceProvider = serviceProvider; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public String getLastRechargeDate() { return lastRechargeDate; }
    public void setLastRechargeDate(String lastRechargeDate) { this.lastRechargeDate = lastRechargeDate; }

    public String getRechargeDueDate() { return rechargeDueDate; }
    public void setRechargeDueDate(String rechargeDueDate) { this.rechargeDueDate = rechargeDueDate; }

    public String getNumber() { return number; }
    public void setNumber(String number) { this.number = number; }

    public String getImeiNumber() { return imeiNumber; }
    public void setImeiNumber(String imeiNumber) { this.imeiNumber = imeiNumber; }

    public String getBuyDate() { return buyDate; }
    public void setBuyDate(String buyDate) { this.buyDate = buyDate; }

    public String getDataPackPlan() { return dataPackPlan; }
    public void setDataPackPlan(String dataPackPlan) { this.dataPackPlan = dataPackPlan; }
}