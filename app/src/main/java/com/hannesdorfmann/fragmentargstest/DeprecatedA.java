package com.hannesdorfmann.fragmentargstest;

import android.app.Fragment;
import com.hannesdorfmann.fragmentargs.annotation.Arg;

/**
 * @author Hannes Dorfmann
 */
public abstract class DeprecatedA extends Fragment {

  @Arg
  int a;
}
