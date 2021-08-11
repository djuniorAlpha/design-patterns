package com.facade;

import java.io.File;

import com.facade.facade.VideoConversionFacade;

public class App {
    public static void main(String[] args) throws Exception {
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
    }
}
