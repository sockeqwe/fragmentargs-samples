package com.hannesdorfmann.fragmentargstest.support;

import com.hannesdorfmann.fragmentargs.annotation.Arg;
import com.hannesdorfmann.fragmentargs.annotation.FragmentWithArgs;
import com.hannesdorfmann.fragmentargstest.A;

/**
 * @author Hannes Dorfmann
 */
@FragmentWithArgs(inherited = false)
public class SupportFragment extends A {

  @Arg String foo;

  public String getFoo( int a){
    return null;
  }
}
