package org.mercuriete.musiciantools.bpmcalculator

class BPMCalculatorServiceImpl : BPMCalculatorService {

    private val timestamps = mutableListOf<Long>()
    private var maxTimestamps: Byte

    constructor() : this(7)

    constructor(maxTimestamps: Byte) {
        this.maxTimestamps = maxTimestamps
    }

    override fun beat() {
        timestamps += System.nanoTime()
    }

    override fun getBPM(): Double {
        //not enough timestamps to calculate deltas
        if (timestamps.size <= 1) {
            return 0.0
        }
        //only store maxTimestamps samples in a FIFO queue
        if (timestamps.size >= maxTimestamps) {
            timestamps.removeAt(0)
        }
        //the period is the elapsed time between the last and first beat
        //divided by number of beats between them
        val period = (timestamps[timestamps.size - 1].toDouble() - timestamps[0].toDouble()) / (timestamps.size - 1).toDouble()
        //bpm is inverse of period in seconds multiplied by 60
        val bpm = 60 * 1E9 / period
        return bpm
    }

    override fun clear() {
        timestamps.clear()
    }
}
