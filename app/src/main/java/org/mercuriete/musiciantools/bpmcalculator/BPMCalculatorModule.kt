package org.mercuriete.musiciantools.bpmcalculator

import dagger.Provides
import dagger.Module
import javax.inject.Singleton

@Module
class BPMCalculatorModule {

    @Provides
    fun bpmCalculatorServiceProvider(): BPMCalculatorService {
        return BPMCalculatorServiceImpl()
    }

    @Singleton
    @Provides
    fun bpmCalculatorPresenterProvider(bpmCalculatorService: BPMCalculatorService): BPMCalculatorContract.Presenter {
        return BPMCalculatorPresenter(bpmCalculatorService)
    }

}
