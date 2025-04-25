package com.invoicemanager.invoice_manager.payment.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import com.invoicemanager.invoice_manager.invoice.model.Invoice;
import com.invoicemanager.invoice_manager.receipt.model.Receipt;

import jakarta.persistence.*;

@Entity
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "invoice_id", nullable = false)
    private Invoice invoice;

    @Column(nullable = false)
    private BigDecimal amount;

    @Column(nullable = false)
    private LocalDate paymentDate;

    private String paymentMethod;
    
    private String transactionId;

    @OneToOne(mappedBy = "payment")
    private Receipt receipt;

    public Long getId() {
      return id;
    }

    public void setId(Long id) {
      this.id = id;
    }

    public Invoice getInvoice() {
      return invoice;
    }

    public void setInvoice(Invoice invoice) {
      this.invoice = invoice;
    }

    public BigDecimal getAmount() {
      return amount;
    }

    public void setAmount(BigDecimal amount) {
      this.amount = amount;
    }

    public LocalDate getPaymentDate() {
      return paymentDate;
    }

    public void setPaymentDate(LocalDate paymentDate) {
      this.paymentDate = paymentDate;
    }

    public String getPaymentMethod() {
      return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
      this.paymentMethod = paymentMethod;
    }

    public String getTransactionId() {
      return transactionId;
    }

    public void setTransactionId(String transactionId) {
      this.transactionId = transactionId;
    }

    public Receipt getReceipt() {
      return receipt;
    }

    public void setReceipt(Receipt receipt) {
      this.receipt = receipt;
    }
    
}
