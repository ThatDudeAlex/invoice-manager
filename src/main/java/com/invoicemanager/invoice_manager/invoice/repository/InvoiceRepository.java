package com.invoicemanager.invoice_manager.invoice.repository;

import com.invoicemanager.invoice_manager.invoice.model.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {
    List<Invoice> findByCustomerId(Long customerId);
}