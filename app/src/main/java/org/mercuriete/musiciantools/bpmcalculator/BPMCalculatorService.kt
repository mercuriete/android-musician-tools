package org.mercuriete.musiciantools.bpmcalculator

interface BPMCalculatorService {
    fun beat()
    fun getBPM(): Double
    fun clear()
}
