```java
package com.ecommerceapp.model;

import java.util.List;

public class Cart {
    private List<Product> products;
    private User user;
    private double total;

    public Cart(List<Product> products, User user) {
        this.products = products;
        this.user = user;
        calculateTotal();
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
        calculateTotal();
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public double getTotal() {
        return total;
    }

    private void calculateTotal() {
        total = 0.0;
        for (Product product : products) {
            total += product.getPrice();
        }
    }
}
```