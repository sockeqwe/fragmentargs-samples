package com.christianbahl.mylibrary;

import com.hannesdorfmann.fragmentargs.annotation.Arg;
import com.hannesdorfmann.fragmentargs.annotation.InheritedFragmentArgs;

/**
 * @author Hannes Dorfmann
 */
@InheritedFragmentArgs(false)
public abstract class B extends A {
  @Arg()
  int b;

}
