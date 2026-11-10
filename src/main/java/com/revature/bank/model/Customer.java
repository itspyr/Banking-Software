package com.revature.bank.model;

public class Customer {

    // from instructions, user stories explain what exactly a customer model should include
    // general info (email, name, phone) US-01
    // login securely requires email US-02
    // update profile info (similar to general info) US-03
    // password protection US-04
    // every customer needs an ID assigned to them
    private int customerId;
    private String firstName;
    private String lastName;
    private String email;
    private String passwordHash;
    private String phone;


    // full constructor, used when loading an EXISTING customer

    public Customer(int customerId, String firstName, String lastName, String email, String passwordHash, String phone) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.passwordHash = passwordHash;
        this.phone = phone;
    }

    // constructor that is used when a new customer registers (N Id Field)

    public Customer(String firstName, String lastName, String email, String passwordHash, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.passwordHash = passwordHash;
        this.phone = phone;
    }

    // getters and setters
    // gives ability for fields to be manipulated or displayed depending on the situation
    // allows for account info to be updated
    // allows for account info to be displayed / retrieved


    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
