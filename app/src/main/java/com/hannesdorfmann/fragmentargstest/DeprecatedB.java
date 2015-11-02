package com.hannesdorfmann.fragmentargstest;

import com.hannesdorfmann.fragmentargs.annotation.Arg;
import com.hannesdorfmann.fragmentargs.annotation.FragmentArgsInherited;

/**
 * @author Hannes Dorfmann
 */
@FragmentArgsInherited(false)
public abstract class DeprecatedB extends DeprecatedA {
  @Arg(required = false)
  int b;

}
