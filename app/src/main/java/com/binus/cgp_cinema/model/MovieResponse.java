package com.binus.cgp_cinema.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class MovieResponse implements Serializable {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("fullTitle")
    @Expose
    private String fullTitle;
    @SerializedName("year")
    @Expose
    private String year;
    @SerializedName("releaseState")
    @Expose
    private String releaseState;
    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("runtimeMins")
    @Expose
    private String runtimeMins;
    @SerializedName("runtimeStr")
    @Expose
    private String runtimeStr;
    @SerializedName("plot")
    @Expose
    private String plot;
    @SerializedName("contentRating")
    @Expose
    private String contentRating;
    @SerializedName("imDbRating")
    @Expose
    private String imDbRating;
    @SerializedName("imDbRatingCount")
    @Expose
    private String imDbRatingCount;
    @SerializedName("metacriticRating")
    @Expose
    private String metacriticRating;
    @SerializedName("genres")
    @Expose
    private String genres;
    @SerializedName("genreList")
    @Expose
    private List<GenreResponse> genreList;
    @SerializedName("directors")
    @Expose
    private String directors;
//    @SerializedName("directorList")
//    @Expose
//    private List<Director> directorList;
    @SerializedName("stars")
    @Expose
    private String stars;
//    @SerializedName("starList")
//    @Expose
//    private List<Star> starList;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFullTitle() {
        return fullTitle;
    }

    public void setFullTitle(String fullTitle) {
        this.fullTitle = fullTitle;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getReleaseState() {
        return releaseState;
    }

    public void setReleaseState(String releaseState) {
        this.releaseState = releaseState;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getRuntimeMins() {
        return runtimeMins;
    }

    public void setRuntimeMins(String runtimeMins) {
        this.runtimeMins = runtimeMins;
    }

    public String getRuntimeStr() {
        return runtimeStr;
    }

    public void setRuntimeStr(String runtimeStr) {
        this.runtimeStr = runtimeStr;
    }

    public String getPlot() {
        return plot;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }

    public String getContentRating() {
        return contentRating;
    }

    public void setContentRating(String contentRating) {
        this.contentRating = contentRating;
    }

    public String getImDbRating() {
        return imDbRating;
    }

    public void setImDbRating(String imDbRating) {
        this.imDbRating = imDbRating;
    }

    public String getImDbRatingCount() {
        return imDbRatingCount;
    }

    public void setImDbRatingCount(String imDbRatingCount) {
        this.imDbRatingCount = imDbRatingCount;
    }

    public String getMetacriticRating() {
        return metacriticRating;
    }

    public void setMetacriticRating(String metacriticRating) {
        this.metacriticRating = metacriticRating;
    }

    public String getGenres() {
        return genres;
    }

    public void setGenres(String genres) {
        this.genres = genres;
    }

    public List<GenreResponse> getGenreList() {
        return genreList;
    }

    public void setGenreList(List<GenreResponse> genreList) {
        this.genreList = genreList;
    }

    public String getDirectors() {
        return directors;
    }

    public void setDirectors(String directors) {
        this.directors = directors;
    }

//    public List<Director> getDirectorList() {
//        return directorList;
//    }

//    public void setDirectorList(List<Director> directorList) {
//        this.directorList = directorList;
//    }

    public String getStars() {
        return stars;
    }

    public void setStars(String stars) {
        this.stars = stars;
    }

//    public List<Star> getStarList() {
//        return starList;
//    }
//
//    public void setStarList(List<Star> starList) {
//        this.starList = starList;
//    }
}
