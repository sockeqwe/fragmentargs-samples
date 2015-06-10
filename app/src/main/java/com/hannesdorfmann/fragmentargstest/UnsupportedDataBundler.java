package com.hannesdorfmann.fragmentargstest;

import android.os.Bundle;
import com.hannesdorfmann.fragmentargs.bundler.ArgsBundler;

/**
 * @author Hannes Dorfmann
 */
public class UnsupportedDataBundler implements ArgsBundler<UnsupportedData> {

  @Override public void put(String key, UnsupportedData value, Bundle bundle) {
    bundle.putInt(key + "-int", value.a);
    bundle.putString(key + "-string", value.foo);
  }

  @Override public UnsupportedData get(String key, Bundle bundle) {
    UnsupportedData data = new UnsupportedData();
    data.a = bundle.getInt(key + "-int");
    data.foo = bundle.getString(key + "string");

    return data;
  }
}
