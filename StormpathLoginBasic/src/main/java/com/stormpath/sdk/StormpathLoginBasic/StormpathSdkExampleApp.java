package com.stormpath.sdk.StormpathLoginBasic;

import com.stormpath.sdk.Stormpath;
import com.stormpath.sdk.StormpathConfiguration;
import com.stormpath.sdk.StormpathLogger;

import android.app.Application;

public class StormpathSdkExampleApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        if (BuildConfig.DEBUG) {
            // we only want to show the logs in debug builds, for easier debugging
            Stormpath.setLogLevel(StormpathLogger.VERBOSE);
        }

        // initialize stormpath
        StormpathConfiguration stormpathConfiguration = new StormpathConfiguration.Builder()
                .baseUrl("https://stormpathnotes.herokuapp.com/")
                .build();
        Stormpath.init(this, stormpathConfiguration);
    }
}
