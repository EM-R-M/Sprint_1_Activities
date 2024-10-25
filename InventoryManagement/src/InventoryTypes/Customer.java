package InventoryTypes;

import java.util.ArrayList;

public class Customer {

    private static final ArrayList<Customer> customers = new ArrayList<>();
    private static int nextCustomerID = 0;
    private final int customerID;
    private String firstName;
    private String lastName;

    public Customer(String firstName, String lastName) {
        this.customerID = nextCustomerID++;
        this.firstName = firstName;
        this.lastName = lastName;
        customers.add(this);
    }

    // No set for ID
    public int getCustomerID() { return customerID; }

    public void setFirstName(String firstName) { this.firstName = firstName; }
    public String getFirstName() { return firstName; }

    public void setLastName(String lastName) { this.lastName = lastName; }
    public String getLastName() { return lastName; }
}
