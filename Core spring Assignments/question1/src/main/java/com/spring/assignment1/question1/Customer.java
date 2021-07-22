package com.spring.assignment1.question1;

public class Customer {
    private int customerId;
    private String customerName;
    private int customerContact;
    private Address customerAddress;

    public Customer(int customerId, String customerName, int customerContact, Address customerAddress) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerContact = customerContact;
        this.customerAddress = customerAddress;
    }

    public int getCustomerId() { return customerId; }

    public void setCustomerId(int customerId) { this.customerId = customerId; }

    public String getCustomerName() { return customerName; }

    public void setCustomerName(String customerName) { this.customerName = customerName; }

    public int getCustomerContact() { return customerContact; }

    public void setCustomerContact(int customerContact) { this.customerContact = customerContact; }

    public Address getCustomerAddress() { return customerAddress; }

    public void setCustomerAddress(Address customerAddress) { this.customerAddress = customerAddress; }



    public void displayInfo(){
            System.out.println("ID: "+customerId+", Name: "+customerName);
            System.out.println("Address: "+customerAddress);
            System.out.println("Contact no: "+customerContact);
        }
    }

