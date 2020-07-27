package com.company.MusicApp;

public class Track {
    private int trackId;
    private String trackName;
    private Category category;
    private Duration duration;
    private String singer;
    private String album;
    private Quality trackQuality;

    @Override
    public String toString() {
        return "Track{" +
                "trackName='" + trackName + '\'' +
                ", category=" + category +
                ", duration=" + duration +
                ", singer='" + singer + '\'' +
                ", album='" + album + '\'' +
                ", trackQuality=" + trackQuality +
                '}';
    }

    public Track(int trackId, String trackName, Category category, Duration duration, String singer, String album, Quality trackQuality) {
        this.trackId = trackId;
        this.trackName = trackName;
        this.category = category;
        this.duration = duration;
        this.singer = singer;
        this.album = album;
        this.trackQuality = trackQuality;
    }

    public int getTrackId() {
        return trackId;
    }

    public void setTrackId(int trackId) {
        this.trackId = trackId;
    }

    public String getTrackName() {
        return trackName;
    }

    public void setTrackName(String trackName) {
        this.trackName = trackName;
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

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public Quality getTrackQuality() {
        return trackQuality;
    }

    public void setTrackQuality(Quality trackQuality) {
        this.trackQuality = trackQuality;
    }

}
