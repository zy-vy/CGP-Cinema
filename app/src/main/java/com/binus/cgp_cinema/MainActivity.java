package com.binus.cgp_cinema;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.Button;

import com.binus.cgp_cinema.helper.ApiInterface;
import com.binus.cgp_cinema.helper.RetrofitInstance;
import com.binus.cgp_cinema.model.ApiResponse;
import com.binus.cgp_cinema.model.MovieResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private MovieAdapter movieAdapter;
    String API_KEY = "";
    RecyclerView recyclerView;
    ApiInterface apiInterface;
    Button btnCgpLocation, btnBookMiniRoom;
    String TAG = "+++Main";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnCgpLocation = findViewById(R.id.btn_show_location);
        btnBookMiniRoom = findViewById(R.id.btn_book_mini_room);

        recyclerView = findViewById(R.id.rvMovieList);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        fetchMovie();

        btnCgpLocation.setOnClickListener(v -> {
            Intent intent = new Intent(this,GcpMapsActivity.class);
            startActivity(intent);
            finish();
        });



        btnBookMiniRoom.setOnClickListener(v -> {
            Intent intent = new Intent(this,BookingActivity.class);
            startActivity(intent);
            finish();
        });
    }

    private void fetchMovie(){
        apiInterface = RetrofitInstance.getRetrofitInstance().create(ApiInterface.class);

        Call<ApiResponse> call = apiInterface.getMovies(API_KEY);
        call.enqueue(new Callback<ApiResponse>() {
            @Override
            public void onResponse(Call<ApiResponse> call, Response<ApiResponse> response) {
                List<MovieResponse> movieResponseList = response.body().getItems();
                movieAdapter = new MovieAdapter(MainActivity.this,movieResponseList);
                recyclerView.setAdapter(movieAdapter);
            }
            @Override
            public void onFailure(Call<ApiResponse> call, Throwable t) {
                Log.e(TAG, "onFailure: ERROR "+t );
            }
        });
    }

}