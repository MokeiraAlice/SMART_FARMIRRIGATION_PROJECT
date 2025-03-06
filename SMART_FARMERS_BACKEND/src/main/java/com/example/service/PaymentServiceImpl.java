package com.example.service;

import com.example.Repository.UserRepository;
import com.example.entity.Payment;
import com.example.Repository.PaymentRepository;
import com.example.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    @Autowired
    private UserRepository userRepository;

  @Override
  public Payment processPayment(Payment request) {

      if (request.getUser() == null || request.getUser().getUserId() == null) {
          throw new IllegalArgumentException("User ID is missing in the payment request!");
      }


        // Fetch the user (throws exception if not found)
        User user = userRepository.findById(request.getUser().getUserId())
                .orElseThrow(() -> new RuntimeException("User not found"));

        // Create and save the payment
        Payment payment = new Payment();
        payment.setUser(user);  // Critical: Link the user
        payment.setAmountPaid(request.getAmountPaid());
        payment.setPaymentDate(request.getPaymentDate());
        payment.setPaymentMethod(request.getPaymentMethod() != null ? request.getPaymentMethod() : "DEFAULT_METHOD"); // Prevent NULL
        payment.setPaymentStatus(request.getPaymentStatus() != null ? request.getPaymentStatus() : Payment.PaymentStatus.valueOf("PENDING"));
        payment.setTransactionRef(UUID.randomUUID().toString()); // Generate unique transactionRef

        return paymentRepository.save(payment);

    }

//    @Override
//    public Payment processPayment(Payment payment) {
//        return paymentRepository.save(payment);
//    }

    @Override
    public List<Payment> getAllPayments() {
        return paymentRepository.findAll();
    }
}
