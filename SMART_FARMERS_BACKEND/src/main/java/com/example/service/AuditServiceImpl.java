package com.example.service;



import com.example.entity.Audit;
import com.example.Repository.AuditRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuditServiceImpl implements AuditService {

    @Autowired
    private AuditRepository auditRepository;

    @Override
    public Audit logAction(Audit audit) {
        return auditRepository.save(audit);
    }

    @Override
    public List<Audit> getAllAuditLogs() {
        return auditRepository.findAll();
    }
}
