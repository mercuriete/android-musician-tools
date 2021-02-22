package org.mercuriete.musiciantools.aboutme

import androidx.fragment.app.Fragment
import dagger.hilt.android.AndroidEntryPoint
import org.mercuriete.musiciantools.R.layout.about_me_fragment
import javax.inject.Inject

@AndroidEntryPoint
class AboutMeFragment @Inject constructor() : Fragment(about_me_fragment), AboutMeContract.View
