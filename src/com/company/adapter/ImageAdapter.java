package com.company.adapter;

public class ImageAdapter implements MoviePlayer {

    ImagePlayer imagePlayer = new ImagePlayer();

    @Override
    public void play() {
        imagePlayer.show();
    }
}
