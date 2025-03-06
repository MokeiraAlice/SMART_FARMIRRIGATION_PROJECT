package com.example.entity;

import jakarta.persistence.*;
//import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "payments")
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="payment_id")
    private int paymentId;

    @Column(name="amount_paid")
    private Double amountPaid;

    @Column(name="payment_date")
    private LocalDate paymentDate;

    @Column(name="payment_status")
    @Enumerated(EnumType.STRING)
    private PaymentStatus paymentStatus;


    @Column(name="payment_method")
    private String paymentMethod;

    @Column(name="transaction_ref")
    private String transactionRef;



    public enum PaymentStatus {
        PENDING, SUCCESS, FAILED
    }

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user; // Link to User (Farmer or Provider)

    public Payment() {
    }

    public Payment(int paymentId, Double amountPaid, LocalDate paymentDate, PaymentStatus paymentStatus, String paymentMethod, String transactionRef, User user) {
        this.paymentId = paymentId;
        this.amountPaid = amountPaid;
        this.paymentDate = paymentDate;
        this.paymentStatus = paymentStatus;
        this.paymentMethod = paymentMethod;
        this.transactionRef = transactionRef;
        this.user = user;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public Double getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(Double amountPaid) {
        this.amountPaid = amountPaid;
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDate paymentDate) {
        this.paymentDate = paymentDate;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getTransactionRef() {
        return transactionRef;
    }

    public void setTransactionRef(String transactionRef) {
        this.transactionRef = transactionRef;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

