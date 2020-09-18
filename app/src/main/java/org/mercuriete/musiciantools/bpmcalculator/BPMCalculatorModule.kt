package org.mercuriete.musiciantools.bpmcalculator

import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector


@Module
abstract class BPMCalculatorModule {

    companion object {
        @Provides
        fun bpmCalculatorServiceProvider(): BPMCalculatorService {
            return BPMCalculatorServiceImpl()
        }

        @Provides
        fun bpmCalculatorPresenterProvider(bpmCalculatorService: BPMCalculatorService): BPMCalculatorContract.Presenter {
            return BPMCalculatorPresenter(bpmCalculatorService)
        }
    }

    @ContributesAndroidInjector
    abstract fun bpmCalculatorFragment(): BPMCalculatorFragment
}
