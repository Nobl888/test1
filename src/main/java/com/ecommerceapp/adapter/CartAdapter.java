```java
package com.ecommerceapp.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.ecommerceapp.R;
import com.ecommerceapp.model.Cart;

import java.util.List;

public class CartAdapter extends RecyclerView.Adapter<CartAdapter.CartViewHolder> {

    private List<Cart> cartList;

    public CartAdapter(List<Cart> cartList) {
        this.cartList = cartList;
    }

    @Override
    public CartViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_cart, parent, false);

        return new CartViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(CartViewHolder holder, int position) {
        Cart cart = cartList.get(position);
        holder.title.setText(cart.getProduct().getTitle());
        holder.price.setText(String.valueOf(cart.getProduct().getPrice()));
        holder.quantity.setText(String.valueOf(cart.getQuantity()));
    }

    @Override
    public int getItemCount() {
        return cartList.size();
    }

    public class CartViewHolder extends RecyclerView.ViewHolder {
        public TextView title, price, quantity;

        public CartViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.cart_item_title);
            price = (TextView) view.findViewById(R.id.cart_item_price);
            quantity = (TextView) view.findViewById(R.id.cart_item_quantity);
        }
    }
}
```