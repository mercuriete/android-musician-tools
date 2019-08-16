package org.mercuriete.musiciantools.test

import cucumber.api.CucumberOptions
import org.junit.runner.RunWith

@CucumberOptions(features = ["features"],
    glue = ["org.mercuriete.musiciantools.test"]
)

class CucumberTestCase
