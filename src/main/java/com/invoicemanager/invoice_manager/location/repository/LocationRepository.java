package com.invoicemanager.invoice_manager.location.repository;

import com.invoicemanager.invoice_manager.location.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface LocationRepository extends JpaRepository<Location, Long> {
    List<Location> findByCustomerId(Long customerId);
}