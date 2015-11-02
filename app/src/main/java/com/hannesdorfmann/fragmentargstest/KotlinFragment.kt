package com.hannesdorfmann.fragmentargstest

import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.hannesdorfmann.fragmentargs.FragmentArgs
import com.hannesdorfmann.fragmentargs.annotation.Arg
import com.hannesdorfmann.fragmentargs.annotation.FragmentWithArgs

/**
 * @author Hannes Dorfmann
 */
@FragmentWithArgs
class KotlinFragment : A() {

    @Arg var foo: String = "foo"
    @Arg(required = false) lateinit var bar: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        FragmentArgs.inject(this)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_kotlin, container, false)

        val tv = view.findViewById(R.id.textView) as TextView

        tv.text = "Foo = ${foo} , bar = ${bar} , a = ${a}"
        return view;
    }
}
