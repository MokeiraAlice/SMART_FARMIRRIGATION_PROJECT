package com.example.service;

import com.example.entity.WaterBill;
import com.example.Repository.WaterBillRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WaterBillServiceImpl implements WaterBillService {

    private final WaterBillRepository waterBillRepository;

    // Constructor-based Dependency Injection
    public WaterBillServiceImpl(WaterBillRepository waterBillRepository) {
        this.waterBillRepository = waterBillRepository;
    }

    @Override
    public WaterBill saveWaterBill(WaterBill waterBill) {
        return waterBillRepository.save(waterBill);
    }

    @Override
    public List<WaterBill> getAllWaterBills() {
        return waterBillRepository.findAll();
    }


}
