package com.hannesdorfmann.fragmentargstest;

import com.hannesdorfmann.fragmentargs.annotation.Arg;

/**
 * @author Hannes Dorfmann
 */
public class SimpleFragment extends AbstractFragment {

  @Arg
  String a;

  @Arg
  String b;
}
