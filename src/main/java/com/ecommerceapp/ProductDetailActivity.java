```java
package com.ecommerceapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.ecommerceapp.model.Product;
import com.ecommerceapp.utilities.NetworkUtils;

public class ProductDetailActivity extends AppCompatActivity {

    private TextView tvProductName, tvProductDescription, tvProductPrice;
    private ImageView ivProductImage;
    private Button btnAddToCart;
    private Product product;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_detail);

        tvProductName = findViewById(R.id.tvProductName);
        tvProductDescription = findViewById(R.id.tvProductDescription);
        tvProductPrice = findViewById(R.id.tvProductPrice);
        ivProductImage = findViewById(R.id.ivProductImage);
        btnAddToCart = findViewById(R.id.btnAddToCart);

        product = (Product) getIntent().getSerializableExtra("product");

        if (product != null) {
            tvProductName.setText(product.getName());
            tvProductDescription.setText(product.getDescription());
            tvProductPrice.setText(String.valueOf(product.getPrice()));
            ivProductImage.setImageBitmap(NetworkUtils.getImage(product.getImageUrl()));
        }

        btnAddToCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Add product to cart
            }
        });
    }
}
```