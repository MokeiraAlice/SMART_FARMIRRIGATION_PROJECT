package com.example.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
//import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "WaterBill")
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
public class WaterBill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="water_bill_id")
    private Long waterBillId;


    @Column(name="previous_reading")
    private String previousReading;

    @Column(name="current_reading")
    private String  currentReading;

    @Column(name="usage_in_litres")
    private Double usageInLitres;

    @Column(name="billing_date")
    private LocalDate billingDate;

    @Column(name="rate")
    private String rate ;

    @Column(name="calculated_cost")
    private Double calculatedCost;

    //@ManyToOne
    //@JoinColumn(name = "user_id", nullable = false)
    //private User user; // Farmer linked to water bill

    @Column(name = "user_id")
    private int userId;


    public Long getWaterBillId() {
        return waterBillId;
    }

    public void setWaterBillId(Long waterBillId) {
        this.waterBillId = waterBillId;
    }

    public String getPreviousReading() {
        return previousReading;
    }

    public void setPreviousReading(String previousReading) {
        this.previousReading = previousReading;
    }

    public String getCurrentReading() {
        return currentReading;
    }

    public void setCurrentReading(String currentReading) {
        this.currentReading = currentReading;
    }

    public Double getUsageInLitres() {
        return usageInLitres;
    }

    public void setUsageInLitres(Double usageInLitres) {
        this.usageInLitres = usageInLitres;
    }

    public LocalDate getBillingDate() {
        return billingDate;
    }

    public void setBillingDate(LocalDate billingDate) {
        this.billingDate = billingDate;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public Double getCalculatedCost() {
        return calculatedCost;
    }

    public void setCalculatedCost(Double calculatedCost) {
        this.calculatedCost = calculatedCost;
    }
}
