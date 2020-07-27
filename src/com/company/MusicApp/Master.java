package com.company.MusicApp;

import java.util.List;

public interface Master<T> {
    void initial();
    List<T> show();
    List<T> sort();
    void showDescription();
    void play();
    void pause();
    void next();
    void previous();
    void seek();
    void delete();

}
