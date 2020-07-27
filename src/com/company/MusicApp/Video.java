package com.company.MusicApp;

public class Video {
    private String videoName;
    private Category category;
    private Duration duration;
    private String author;
    private Quality videoQuality;

    public Video(String videoName, Category category, Duration duration, String author, Quality videoQuality) {
        this.videoName = videoName;
        this.category = category;
        this.duration = duration;
        this.author = author;
        this.videoQuality = videoQuality;
    }

    public String getVideoName() {
        return videoName;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Quality getVideoQuality() {
        return videoQuality;
    }

    public void setVideoQuality(Quality videoQuality) {
        this.videoQuality = videoQuality;
    }

    @Override
    public String toString() {
        return "Video{" +
                "videoName='" + videoName + '\'' +
                ", category=" + category +
                ", duration=" + duration +
                ", author='" + author + '\'' +
                ", videoQuality=" + videoQuality +
                '}';
    }
}
