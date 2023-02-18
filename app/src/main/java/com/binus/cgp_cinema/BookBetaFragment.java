package com.binus.cgp_cinema;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class BookBetaFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_book_beta,null);
        Button book = view.findViewById(R.id.btn_book);

        book.setOnClickListener(v -> {
            Toast.makeText(container.getContext(),"Book Beta Theater", Toast.LENGTH_SHORT).show();
        });

        return view;
    }
}