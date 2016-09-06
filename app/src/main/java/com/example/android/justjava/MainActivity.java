
package com.example.android.justjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitOrder(View view) {
        increment();
        displayPrice();
    }

    private void increment() {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        int current_number = Integer.parseInt(quantityTextView.getText().toString());
        int new_number = current_number+1;
        quantityTextView.setText("" + new_number);
    }

    private void displayPrice(){
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        int qty = Integer.parseInt(quantityTextView.getText().toString());
        int price = 5;
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(qty*price));
    }
}