package com.hannesdorfmann.fragmentargstest;

import android.app.Fragment;
import android.os.Bundle;
import com.hannesdorfmann.fragmentargs.FragmentArgs;
import com.hannesdorfmann.fragmentargs.annotation.Arg;
import com.hannesdorfmann.fragmentargs.annotation.FragmentWithArgs;

/**
 * @author Hannes Dorfmann
 */
@FragmentWithArgs public class OnlyOptionalFragments extends Fragment {
  @Arg(required = false) int foo;

  @Override public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    FragmentArgs.inject(this);
  }
}
