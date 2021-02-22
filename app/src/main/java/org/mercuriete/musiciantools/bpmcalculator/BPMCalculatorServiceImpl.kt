package org.mercuriete.musiciantools.bpmcalculator

class BPMCalculatorServiceImpl : BPMCalculatorService {

    companion object {
        private const val SECS_PER_MIN = 60
        private const val NANOS_PER_SEC = 1E9
        private const val MAX_TIMESTAMPS: Byte = 7
    }

    private val timestamps = mutableListOf<Long>()
    private var maxTimestamps: Byte

    constructor() : this(MAX_TIMESTAMPS)

    constructor(maxTimestamps: Byte) {
        this.maxTimestamps = maxTimestamps
    }

    override fun beat() {
        timestamps += System.nanoTime()
        //only store maxTimestamps samples in a FIFO queue
        if (timestamps.size > maxTimestamps) {
            timestamps.removeAt(0)
        }
    }

    override fun getBPM(): Double {
        //not enough timestamps to calculate deltas
        if (timestamps.size <= 1) {
            return 0.0
        }
        //the period is the elapsed time between the last and first beat
        //divided by number of beats between them
        val period = (timestamps[timestamps.size - 1].toDouble() - timestamps[0].toDouble()) /
            (timestamps.size - 1).toDouble()
        //bpm is inverse of period in seconds multiplied by 60
        return SECS_PER_MIN * NANOS_PER_SEC / period
    }

    override fun clear() {
        timestamps.clear()
    }
}
