package org.mercuriete.musiciantools.aboutme

import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class AboutMeModule {

    @ContributesAndroidInjector
    abstract fun aboutMeFragment(): AboutMeFragment
}
