package com.example.controller;


import com.example.entity.Audit;
import com.example.service.AuditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/audit")
public class AuditController {

    @Autowired
    private AuditService auditService;

    @PostMapping("/log")
    public Audit logAction(@RequestBody Audit audit) {
        return auditService.logAction(audit);
    }

    @GetMapping("/all")
    public List<Audit> getAllAuditRecords() {
        return auditService.getAllAuditLogs();
    }
}
