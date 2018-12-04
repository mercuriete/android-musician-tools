package org.mercuriete.musiciantools.bpmcalculator

import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector


@Module
abstract class BPMCalculatorModule {

    @Module
    companion object {
        @JvmStatic
        @Provides
        fun bpmCalculatorServiceProvider(): BPMCalculatorService {
            return BPMCalculatorServiceImpl()
        }

        @JvmStatic
        @Provides
        fun bpmCalculatorPresenterProvider(bpmCalculatorService: BPMCalculatorService): BPMCalculatorContract.Presenter {
            return BPMCalculatorPresenter(bpmCalculatorService)
        }
    }

    @ContributesAndroidInjector
    abstract fun bpmCalculatorFragment(): BPMCalculatorFragment
}
