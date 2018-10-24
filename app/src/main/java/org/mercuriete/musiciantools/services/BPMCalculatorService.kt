package org.mercuriete.musiciantools.services

interface BPMCalculatorService {
    fun beat()
    fun getBPM(): Double
    fun clear()
}
