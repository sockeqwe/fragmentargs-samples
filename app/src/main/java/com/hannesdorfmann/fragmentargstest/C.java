package com.hannesdorfmann.fragmentargstest;

import android.os.Bundle;
import com.hannesdorfmann.fragmentargs.FragmentArgs;
import com.hannesdorfmann.fragmentargs.annotation.Arg;
import com.hannesdorfmann.fragmentargs.annotation.FragmentArgsInherited;
import com.hannesdorfmann.fragmentargs.bundler.ParcelerArgsBundler;

/**
 * @author Hannes Dorfmann
 */
@FragmentArgsInherited public class C extends B {

  @Arg(bundler = UnsupportedDataBundler.class) UnsupportedData foo;
  @Arg(bundler = UnsupportedDataBundler.class) UnsupportedData otherFoo;


  @Arg(bundler = ParcelerArgsBundler.class, required = false)
  ParcelerModel model;

  @Override public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    FragmentArgs.inject(this);

  }
}
