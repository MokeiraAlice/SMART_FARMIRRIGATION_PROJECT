package com.example.controller;


import com.example.entity.WaterBill;
import com.example.service.WaterBillService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/waterbill")
public class WaterBillController {

    private final WaterBillService waterBillService;

    public WaterBillController(WaterBillService waterBillService) {
        this.waterBillService = waterBillService;
    }

    @PostMapping
    public WaterBill createWaterBill(@RequestBody WaterBill waterBill) {
        return waterBillService.saveWaterBill(waterBill);
    }

    @GetMapping
    public List<WaterBill> getWaterBills() {
        return waterBillService.getAllWaterBills();
    }
}
