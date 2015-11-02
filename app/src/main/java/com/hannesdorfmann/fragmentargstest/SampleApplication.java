package com.hannesdorfmann.fragmentargstest;

import android.app.Application;
import timber.log.Timber;

/**
 * @author Hannes Dorfmann
 */
public class SampleApplication extends Application {

  @Override public void onCreate() {
    super.onCreate();

    if (BuildConfig.DEBUG) {
      Timber.plant(new Timber.DebugTree());
    }
  }
}
