package com.binus.cgp_cinema;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.binus.cgp_cinema.model.MovieResponse;
import com.bumptech.glide.Glide;

public class MovieScreen extends AppCompatActivity {

    ImageView imgMovie;
    TextView tvDescription, tvTitle, tvDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_screen);

        imgMovie = findViewById(R.id.imgMovieScreen);
        tvTitle = findViewById(R.id.tvMovieTitle);
        tvDescription = findViewById(R.id.tvMovieDescription);
        tvDetail = findViewById(R.id.tvMovieDetail);

        MovieResponse movie = (MovieResponse) getIntent().getSerializableExtra("movie");

        tvTitle.setText(movie.getFullTitle());
        tvDescription.setText(movie.getPlot());
        tvDetail.setText(movie.getStars());
        Glide.with(getApplicationContext()).load(movie.getImage())
                .into(imgMovie);

    }
}