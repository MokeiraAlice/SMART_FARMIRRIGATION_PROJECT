package com.example.service;

import com.example.entity.Audit;
import java.util.List;

public interface AuditService {
    Audit logAction(Audit audit);
    List<Audit> getAllAuditLogs();
}
