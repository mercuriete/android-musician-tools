package org.mercuriete.musiciantools
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication;
import org.mercuriete.musiciantools.di.DaggerAppComponent

class MusicianToolsApp:DaggerApplication() {
    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent.builder().application(this).build()
    }
}
