package org.mercuriete.musiciantools.di

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import org.mercuriete.musiciantools.MusicianToolsApp
import javax.inject.Singleton

/**
 * This is a Dagger component. Refer to [MusicianToolsApp] for the list of Dagger components
 * used in this application.
 *
 *
 * Even though Dagger allows annotating a [Component] as a singleton, the code
 * itself must ensure only one instance of the class is created. This is done in [ ].
 * //[AndroidSupportInjectionModule]
 * // is the module from Dagger.Android that helps with the generation
 * // and location of subcomponents.
 */
@Singleton
@Component(modules =
[
    AndroidSupportInjectionModule::class,
    ApplicationModule::class,
    ActivityBindingModule::class
])
interface AppComponent : AndroidInjector<MusicianToolsApp> {
    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): AppComponent.Builder

        fun build(): AppComponent
    }
}
