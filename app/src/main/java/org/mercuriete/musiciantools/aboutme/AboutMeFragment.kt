package org.mercuriete.musiciantools.aboutme

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import dagger.android.support.DaggerFragment
import org.mercuriete.musiciantools.R
import javax.inject.Inject

class AboutMeFragment @Inject constructor() : DaggerFragment(), AboutMeContract.View {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.about_me_fragment, container, false)
    }
}
