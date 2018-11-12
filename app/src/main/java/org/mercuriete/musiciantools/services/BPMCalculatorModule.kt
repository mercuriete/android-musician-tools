package org.mercuriete.musiciantools.services

import android.content.Intent.getIntent
import dagger.Provides
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
class BPMCalculatorModule {

    @Provides
    fun bpmCalculatorServiceProvider(): BPMCalculatorService {
        return BPMCalculatorServiceImpl()
    }
}
