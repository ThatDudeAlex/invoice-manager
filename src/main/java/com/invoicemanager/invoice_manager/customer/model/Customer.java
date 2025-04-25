package com.invoicemanager.invoice_manager.customer.model;

import com.invoicemanager.invoice_manager.common.State;
import com.invoicemanager.invoice_manager.invoice.model.Invoice;
import com.invoicemanager.invoice_manager.location.model.Location;
import com.invoicemanager.invoice_manager.user.model.AppUser;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private AppUser user;

    @Column(nullable = false)
    private String companyName;

    @Email
    @Column(nullable = false)
    private String email;

    private String address;
    private String city;

    @Enumerated(EnumType.STRING)
    private State state;

    private String zipcode;
    private String phoneNumber;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Location> locations = new ArrayList<>();

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Invoice> invoices = new ArrayList<>();

    public Long getId() {
      return id;
    }

    public void setId(Long id) {
      this.id = id;
    }

    public AppUser getUser() {
      return user;
    }

    public void setUser(AppUser user) {
      this.user = user;
    }

    public String getCompanyName() {
      return companyName;
    }

    public void setCompanyName(String companyName) {
      this.companyName = companyName;
    }

    public String getEmail() {
      return email;
    }

    public void setEmail(String email) {
      this.email = email;
    }

    public String getAddress() {
      return address;
    }

    public void setAddress(String address) {
      this.address = address;
    }

    public String getCity() {
      return city;
    }

    public void setCity(String city) {
      this.city = city;
    }

    public State getState() {
      return state;
    }

    public void setState(State state) {
      this.state = state;
    }

    public String getZipcode() {
      return zipcode;
    }

    public void setZipcode(String zipcode) {
      this.zipcode = zipcode;
    }

    public String getPhoneNumber() {
      return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
      this.phoneNumber = phoneNumber;
    }

    public List<Location> getLocations() {
      return locations;
    }

    public void setLocations(List<Location> locations) {
      this.locations = locations;
    }

    public List<Invoice> getInvoices() {
      return invoices;
    }

    public void setInvoices(List<Invoice> invoices) {
      this.invoices = invoices;
    }

}