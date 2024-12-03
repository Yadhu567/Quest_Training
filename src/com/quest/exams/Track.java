package com.quest.exams;


public class Track {
    private int id;
    private String title;
    private String artist;
    private double duration;
    private double rating;

    public Track(int id, String title, String artist, double duration,double rating) {
        setId(id);
        setTitle(title);
        setArtist(artist);
        setDuration(duration);
        setRating(rating);
    }
    // setters and getters
    public String getArtist() {
        return artist;
    }

    public void setArtist(String artists) {
        this.artist = artists;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        if (rating >= 1 && rating <= 5) { // to set rating between 1 and 5
            this.rating = rating;
        } else {
            throw new IllegalArgumentException(" the rating must be between 1 and 5");
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //overriding  equals method
    @Override
    public boolean equals(Object obj) {
        Track t=(Track) obj; // down casting the object class obj
        return this.getId()==t.getId();
    }

    //overriding  hashcode method
    @Override
    public int hashCode() {
        return id;
    }

    //overriding  toString method
    @Override
    public String toString() {
        return "Track{" +
                "id='" + getId() + '\'' +
                ", title='" + getTitle() + '\'' +
                ", artists='" + getArtist() + '\'' +
                ", duration=" + getDuration() +
                ", rating=" + getRating() +
                '}';
    }
}
