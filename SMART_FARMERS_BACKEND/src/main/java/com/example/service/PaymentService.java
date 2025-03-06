package com.example.service;



import com.example.Repository.PaymentRepository;
import com.example.entity.Payment;
import java.util.List;

public interface PaymentService {
    Payment processPayment(Payment payment);

//    Payment processPayment(PaymentRepository request);

    List<Payment> getAllPayments();
}
