package com.hannesdorfmann.fragmentargstest.bug;

import android.support.v4.app.Fragment;
import com.hannesdorfmann.fragmentargs.annotation.Arg;
import com.hannesdorfmann.fragmentargs.annotation.FragmentWithArgs;
import com.hannesdorfmann.fragmentargs.bundler.ParcelerArgsBundler;

@FragmentWithArgs
public class LoginFragment extends Fragment {
    @Arg
    private boolean animated;

    @Arg( bundler = ParcelerArgsBundler.class )
    private AuthData authData;


    @Arg( bundler = ParcelerArgsBundler.class , required = true)
    AuthData authData1;

    public void setAnimated(boolean animated) {
        this.animated = animated;
    }

    public void setAuthData(AuthData authData) {
        this.authData = authData;
    }


    public void setAuthData1(AuthData authData) {
        this.authData1 = authData;
    }
}