package com.binus.cgp_cinema;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.binus.cgp_cinema.model.ApiResponse;
import com.binus.cgp_cinema.model.MovieResponse;
import com.bumptech.glide.Glide;

import java.util.List;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MyViewHolder> {

    private Context context;
    private List<MovieResponse> movieList;
    private RecyclerView mRecyclerView;
    private final View.OnClickListener mOnClickListener = new MyOnClickListener();

    public MovieAdapter(Context context, List<MovieResponse> movieList) {
        this.context = context;
        this.movieList = movieList;
    }

    @NonNull
    @Override
    public MovieAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        view = inflater.inflate(R.layout.movie_item,parent,false);
        view.setOnClickListener(mOnClickListener);

        MovieAdapter.MyViewHolder viewHolder = new MovieAdapter.MyViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MovieAdapter.MyViewHolder holder, int position) {
        holder.tvTitle.setText(movieList.get(position).getFullTitle());
        holder.tvDescription.setText(movieList.get(position).getPlot());
        holder.tvGenre.setText(movieList.get(position).getGenres());
        holder.tvStar.setText("Rating : " +movieList.get(position).getImDbRating());
        Glide.with(context).load(movieList.get(position).getImage())
                .into(holder.imgMovie);



    }

    @Override
    public int getItemCount() {
        return movieList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView imgMovie;
        TextView tvTitle, tvDescription,tvGenre,tvStar;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            imgMovie = itemView.findViewById(R.id.imgMovie);
            tvTitle = itemView.findViewById(R.id.tvTitle);
            tvDescription = itemView.findViewById(R.id.tvDescription);
            tvGenre = itemView.findViewById(R.id.tvGenre);
            tvStar = itemView.findViewById(R.id.tvStar);


        }
    }

    @Override
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        mRecyclerView= recyclerView;
        super.onAttachedToRecyclerView(recyclerView);
    }

    private class MyOnClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            int itemPosition = mRecyclerView.getChildLayoutPosition(v);
            MovieResponse movie = movieList.get(itemPosition);
            Toast.makeText(context, movie.getTitle(), Toast.LENGTH_SHORT).show();
            context.startActivity(new Intent(context,MovieScreen.class).putExtra("movie",movie));

        }
    }
}
