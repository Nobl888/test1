```java
package com.ecommerceapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.ecommerceapp.model.Cart;
import com.ecommerceapp.utilities.NetworkUtils;

public class CheckoutActivity extends AppCompatActivity {

    private TextView totalAmount;
    private Button placeOrderButton;
    private Cart cart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);

        totalAmount = findViewById(R.id.totalAmount);
        placeOrderButton = findViewById(R.id.placeOrderButton);

        cart = (Cart) getIntent().getSerializableExtra("cart");

        totalAmount.setText(String.valueOf(cart.getTotalAmount()));

        placeOrderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                placeOrder();
            }
        });
    }

    private void placeOrder() {
        // Here you can call the API to place the order using NetworkUtils
        // For example: NetworkUtils.placeOrder(cart);
    }
}
```