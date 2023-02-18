package com.binus.cgp_cinema;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.widget.Button;

public class BookingActivity extends AppCompatActivity {

    FragmentManager fm;
    BookAlphaFragment bookAlphaFragment;
    BookBetaFragment bookBetaFragment;
    Button btnCgpAlpha,btnCgpBeta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking);

        fm = getSupportFragmentManager();
        bookAlphaFragment = new BookAlphaFragment();
        bookBetaFragment = new BookBetaFragment();
        btnCgpAlpha = findViewById(R.id.btn_cgp_alpha);
        btnCgpBeta = findViewById(R.id.btn_cgp_beta);

        fm.beginTransaction()
                .add(R.id.fragment_container, bookAlphaFragment)
                .show(bookAlphaFragment)
                .commit();

        btnCgpAlpha.setOnClickListener(v -> {
            fm.beginTransaction()
                    .replace(R.id.fragment_container, bookAlphaFragment)
                    .commit();
        });

        btnCgpBeta.setOnClickListener(v -> {
            fm.beginTransaction()
                    .replace(R.id.fragment_container, bookBetaFragment)
                    .commit();
        });

    }
}