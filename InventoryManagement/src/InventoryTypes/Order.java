package InventoryTypes;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;

public class Order {

    private static final ArrayList<Order> orders = new ArrayList<>();
    private static int nextOrderID = 0;
    private final int orderID;
    private Customer customer;
    private Dictionary<String, Integer> orderedProducts = new Hashtable<>();

    public Order (){
        orders.add(this);
    }

}
