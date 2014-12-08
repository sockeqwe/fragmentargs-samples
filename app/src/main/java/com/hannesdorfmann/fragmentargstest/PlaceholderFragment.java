package com.hannesdorfmann.fragmentargstest;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.hannesdorfmann.fragmentargs.FragmentArgs;
import com.hannesdorfmann.fragmentargs.annotation.InheritedFragmentArgs;

/**
 * @author Hannes Dorfmann
 */
@InheritedFragmentArgs
public class PlaceholderFragment extends B {


  public PlaceholderFragment() {
  }

  public void onCreate(Bundle b) {
    super.onCreate(b);
    FragmentArgs.inject(this);
  }

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
    View rootView = inflater.inflate(R.layout.fragment_my, container, false);
    TextView tv = (TextView) rootView.findViewById(R.id.name);

    tv.setText("" + a + " " + b);
    return rootView;
  }
}

