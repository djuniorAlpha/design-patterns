package com.proxy;

import com.proxy.downloader.YoutubeDownloader;
import com.proxy.proxy.YouTubeCacheProxy;
import com.proxy.some_cool_media_library.ThirdPartyYouTubeClass;

public class App {
    public static void main(String[] args) throws Exception {
        YoutubeDownloader naiveDownloader = new YoutubeDownloader(new ThirdPartyYouTubeClass());
        YoutubeDownloader smartDownloader = new YoutubeDownloader(new YouTubeCacheProxy());

        long naive = test(naiveDownloader);
        long smart = test(smartDownloader);
        System.out.print("Time saved by caching proxy: " + (naive - smart) + "ms");
    }

    private static long test(YoutubeDownloader downloader) {
        long startTime = System.currentTimeMillis();

        // User behavior in our app:
        downloader.renderPopularVideos();
        downloader.renderVideoPage("catzzzzzzzzz");
        downloader.renderPopularVideos();
        downloader.renderVideoPage("dancesvideoo");
        // Users might visit the same page quite often.
        downloader.renderVideoPage("catzzzzzzzzz");
        downloader.renderVideoPage("someothervid");

        long estimatedTime = System.currentTimeMillis() - startTime;
        System.out.print("Time elapsed: " + estimatedTime + "ms\n");
        return estimatedTime;
    }
}
