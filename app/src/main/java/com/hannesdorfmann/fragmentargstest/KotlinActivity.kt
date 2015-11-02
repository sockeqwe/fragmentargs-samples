package com.hannesdorfmann.fragmentargstest

import android.os.Bundle
import android.app.Activity

class KotlinActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin)

        if (savedInstanceState == null) {
            fragmentManager.beginTransaction()
                    .replace(R.id.container, KotlinFragmentBuilder(12, "fooString").bar("barStr").build())
                    .commit()
        }
    }
}
