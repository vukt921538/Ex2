package com.company.MusicApp;

public class Quality {
    private String qualityName;
    private int level;

    public Quality(String qualityName, int level) {
        this.qualityName = qualityName;
        this.level = level;
    }

    public String getQualityName() {
        return qualityName;
    }

    public void setQualityName(String qualityName) {
        this.qualityName = qualityName;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
