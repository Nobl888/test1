```java
package com.ecommerceapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class OrderConfirmationActivity extends AppCompatActivity {

    private TextView orderConfirmationMessage;
    private Button continueShoppingButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_confirmation);

        orderConfirmationMessage = findViewById(R.id.order_confirmation_message);
        continueShoppingButton = findViewById(R.id.continue_shopping_button);

        continueShoppingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent to go back to MainActivity
                Intent intent = new Intent(OrderConfirmationActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
```