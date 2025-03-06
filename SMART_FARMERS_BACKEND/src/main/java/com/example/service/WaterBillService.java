package com.example.service;
import com.example.entity.WaterBill;
import java.util.List;


public interface WaterBillService {
    WaterBill saveWaterBill(WaterBill waterBill);
    List<WaterBill> getAllWaterBills();
}



