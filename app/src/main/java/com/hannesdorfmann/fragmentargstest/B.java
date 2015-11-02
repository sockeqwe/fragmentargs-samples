package com.hannesdorfmann.fragmentargstest;

import com.hannesdorfmann.fragmentargs.annotation.Arg;
import com.hannesdorfmann.fragmentargs.annotation.FragmentWithArgs;

/**
 * @author Hannes Dorfmann
 */
@FragmentWithArgs public abstract class B extends A {
  @Arg(required = false) private int b;

  void setB(int b) {
    this.b = b;
  }
}
