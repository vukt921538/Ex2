package com.company.MusicApp;

import java.util.ArrayList;
import java.util.List;

public class TrackMaster implements Master {

    //method added
    public void zoom(){

    }
    public void changeResolution(){

    }
    //----

    @Override
    public void initial() {
        // Init here
    }

    @Override
    public List<Track> show() {
        initial();
        List<Track> listMusic = new ArrayList<>();
        return listMusic;
    }

    @Override
    public List<Track> sort() {
        return null;
    }

    @Override
    public void showDescription() {

    }

    @Override
    public void play() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void next() {

    }

    @Override
    public void previous() {

    }

    @Override
    public void seek() {

    }

    @Override
    public void delete() {

    }
}
