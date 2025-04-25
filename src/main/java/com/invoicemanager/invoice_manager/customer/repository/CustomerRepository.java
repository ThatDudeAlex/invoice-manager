package com.invoicemanager.invoice_manager.customer.repository;

import com.invoicemanager.invoice_manager.customer.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    List<Customer> findByUserId(Long userId);
}