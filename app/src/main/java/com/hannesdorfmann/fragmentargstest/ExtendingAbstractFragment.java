package com.hannesdorfmann.fragmentargstest;

import com.hannesdorfmann.fragmentargs.annotation.Arg;

/**
 * @author Hannes Dorfmann
 */
public class ExtendingAbstractFragment extends AbstractFragment {

  @Arg(required = false, key = "hallo") int other;
}
