```java
package com.ecommerceapp;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.ecommerceapp.model.User;
import com.ecommerceapp.utilities.Constants;

public class ProfileActivity extends AppCompatActivity {

    private TextView userName;
    private TextView userEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        userName = findViewById(R.id.user_name);
        userEmail = findViewById(R.id.user_email);

        User user = (User) getIntent().getSerializableExtra(Constants.USER_KEY);
        if (user != null) {
            userName.setText(user.getName());
            userEmail.setText(user.getEmail());
        }
    }

    public void onLogoutClick(View view) {
        // Implement logout functionality here
    }
}
```