package com.invoicemanager.invoice_manager.location.model;

import com.invoicemanager.invoice_manager.common.State;
import com.invoicemanager.invoice_manager.customer.model.Customer;
import jakarta.persistence.*;

@Entity
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    @Column(nullable = false)
    private String address;

    private String city;

    @Enumerated(EnumType.STRING)
    private State state;

    private String zipcode;

    public Long getId() {
      return id;
    }

    public void setId(Long id) {
      this.id = id;
    }

    public Customer getCustomer() {
      return customer;
    }

    public void setCustomer(Customer customer) {
      this.customer = customer;
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

    
}