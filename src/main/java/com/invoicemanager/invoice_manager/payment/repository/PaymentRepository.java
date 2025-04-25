package com.invoicemanager.invoice_manager.payment.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.invoicemanager.invoice_manager.payment.model.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
  Payment findByInvoiceId(Long invoiceId);

  Optional<Payment> findByTransactionId(String transactionId);
}
