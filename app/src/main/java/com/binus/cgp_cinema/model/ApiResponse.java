package com.binus.cgp_cinema.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ApiResponse {

    @SerializedName("items")
    @Expose
    private List<MovieResponse> items;
    @SerializedName("errorMessage")
    @Expose
    private String errorMessage;

    public List<MovieResponse> getItems() {
        return items;
    }

    public void setItems(List<MovieResponse> items) {
        this.items = items;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

}
