package com.hannesdorfmann.fragmentargstest;

import com.hannesdorfmann.fragmentargs.annotation.Arg;
import com.hannesdorfmann.fragmentargs.annotation.FragmentArgsInherited;

/**
 * @author Hannes Dorfmann
 */
@FragmentArgsInherited(false)
public abstract class B extends A {
  @Arg(required = false)
  int b;

}
