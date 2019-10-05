package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int amount = 1;
    int price = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnMinus = findViewById(R.id.btn_minus);
        Button btnPlus = findViewById(R.id.btn_plus);
        final TextView tvAmount = findViewById(R.id.tv_amount);
        final CheckBox cbCream = findViewById(R.id.cb_cream);
        final CheckBox cbCC = findViewById(R.id.cb_cc);
        final CheckBox cbVanilla = findViewById(R.id.cb_vanilla);
        Button btnOrder = findViewById(R.id.btn_order);
        final TextView tvTy = findViewById(R.id.tv_ty);

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Do your stuff here
                if (amount>1) {
                    amount--;
                    tvAmount.setText(Integer.toString(amount));
                }
            }
        });

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                amount++;
                tvAmount.setText(Integer.toString(amount));
            }
        });

        btnOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int finalPrice = price;

                if(cbCream.isChecked()){
                    finalPrice += 1;
                }

                if(cbCC.isChecked()){
                    finalPrice += 2;
                }

                if(cbVanilla.isChecked()){
                    finalPrice += 3;
                }

                finalPrice *= amount;

                tvTy.setText("Thank You for your order. \n The total price is"+(Integer.toString(finalPrice)));
            }
        });

    }
}
