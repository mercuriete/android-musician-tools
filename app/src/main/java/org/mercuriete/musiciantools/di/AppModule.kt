package org.mercuriete.musiciantools.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import org.mercuriete.musiciantools.bpmcalculator.BPMCalculatorContract
import org.mercuriete.musiciantools.bpmcalculator.BPMCalculatorPresenter
import org.mercuriete.musiciantools.bpmcalculator.BPMCalculatorService
import org.mercuriete.musiciantools.bpmcalculator.BPMCalculatorServiceImpl

/**
 * Module to tell Hilt how to provide instances of types that cannot be constructor-injected.
 *
 * As these types are scoped to the application lifecycle using @Singleton, they're installed
 * in Hilt's ApplicationComponent.
 */
@Module
@InstallIn(ApplicationComponent::class)
object AppModule {

    @Provides
    fun bpmCalculatorServiceProvider(): BPMCalculatorService {
        return BPMCalculatorServiceImpl()
    }

    @Provides
    fun bpmCalculatorPresenterProvider(bpmCalculatorService: BPMCalculatorService): BPMCalculatorContract.Presenter {
        return BPMCalculatorPresenter(bpmCalculatorService)
    }
}
