package com.invoicemanager.invoice_manager.receipt.repository;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.invoicemanager.invoice_manager.receipt.model.Receipt;

public interface ReceiptRepository extends JpaRepository<Receipt, Integer> {

  Optional<Receipt> findByReceiptNumber(String receiptNumber);

  List<Receipt> findByCustomerId(Integer customerId);
}