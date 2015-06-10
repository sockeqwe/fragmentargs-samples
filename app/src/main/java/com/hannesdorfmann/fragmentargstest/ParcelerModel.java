package com.hannesdorfmann.fragmentargstest;

import org.parceler.Parcel;

/**
 * @author Hannes Dorfmann
 */
@Parcel
public class ParcelerModel {

  String foo;
  int a;

  public ParcelerModel(String foo, int a) {
    this.foo = foo;
    this.a = a;
  }

  public ParcelerModel() {
  }
}
