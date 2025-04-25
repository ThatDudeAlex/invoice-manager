package com.invoicemanager.invoice_manager.user.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.invoicemanager.invoice_manager.user.model.AppUser;

public interface UserRepository extends JpaRepository<AppUser, Long> {
  Optional<AppUser> findByEmail(String email);

  boolean existsByEmail(String email);
}
