package com.invoicemanager.invoice_manager.receipt.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.invoicemanager.invoice_manager.customer.model.Customer;
import com.invoicemanager.invoice_manager.payment.model.Payment;

import jakarta.persistence.*;

@Entity
public class Receipt {
  @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "payment_id", nullable = false)
    private Payment payment;
    
    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    @Column(unique = true, nullable = false)
    private String receiptNumber;

    @Column(nullable = false)
    private LocalDate receiptDate;

    @Column(nullable = false)
    private BigDecimal amount;

    private String paymentMethod;

    public Long getId() {
      return id;
    }

    public void setId(Long id) {
      this.id = id;
    }

    public Payment getPayment() {
      return payment;
    }

    public void setPayment(Payment payment) {
      this.payment = payment;
    }

    public Customer getCustomer() {
      return customer;
    }

    public void setCustomer(Customer customer) {
      this.customer = customer;
    }

    public String getReceiptNumber() {
      return receiptNumber;
    }

    public void setReceiptNumber(String receiptNumber) {
      this.receiptNumber = receiptNumber;
    }

    public LocalDate getReceiptDate() {
      return receiptDate;
    }

    public void setReceiptDate(LocalDate receiptDate) {
      this.receiptDate = receiptDate;
    }

    public BigDecimal getAmount() {
      return amount;
    }

    public void setAmount(BigDecimal amount) {
      this.amount = amount;
    }

    public String getPaymentMethod() {
      return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
      this.paymentMethod = paymentMethod;
    }

    
}
