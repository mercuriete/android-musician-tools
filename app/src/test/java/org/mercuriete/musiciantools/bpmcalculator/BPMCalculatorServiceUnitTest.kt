package org.mercuriete.musiciantools.bpmcalculator

import org.junit.Assert
import org.junit.Test

const val DELTA = 0.5

class BPMCalculatorServiceUnitTest {
    private var bpmCalculatorService = BPMCalculatorServiceImpl()
    @Test
    fun calculate0Beat() {
        bpmCalculatorService.clear()
        val actual = bpmCalculatorService.getBPM()
        Assert.assertEquals(0.0, actual, DELTA)
    }

    @Test
    fun calculate1Beat() {
        bpmCalculatorService.clear()
        bpmCalculatorService.beat()
        val actual = bpmCalculatorService.getBPM()
        Assert.assertEquals(0.0, actual, DELTA)
    }

    @Test
    fun calculate2Beat() {
        bpmCalculatorService.clear()
        bpmCalculatorService.beat()
        Thread.sleep(500)
        bpmCalculatorService.beat()
        val actual = bpmCalculatorService.getBPM()
        Assert.assertEquals(120.0, actual, DELTA)
    }

    @Test
    fun calculate3Beat() {
        bpmCalculatorService.clear()
        bpmCalculatorService.beat()
        Thread.sleep(1000)
        bpmCalculatorService.beat()
        Thread.sleep(1000)
        bpmCalculatorService.beat()
        val actual = bpmCalculatorService.getBPM()
        Assert.assertEquals(60.0, actual, DELTA)
    }

    @Test
    fun calculate4Beat() {
        bpmCalculatorService.clear()
        bpmCalculatorService.beat()
        Thread.sleep(190)
        bpmCalculatorService.beat()
        Thread.sleep(200)
        bpmCalculatorService.beat()
        Thread.sleep(210)
        bpmCalculatorService.beat()
        val actual = bpmCalculatorService.getBPM()
        Assert.assertEquals(300.0, actual, DELTA)
    }

    @Test
    fun calculate10Beat() {
        bpmCalculatorService.clear()
        bpmCalculatorService.beat()
        for (i in 1..9) {
            Thread.sleep(200)
            bpmCalculatorService.beat()
        }
        val actual = bpmCalculatorService.getBPM()
        Assert.assertEquals(300.0, actual, DELTA)
    }
}
