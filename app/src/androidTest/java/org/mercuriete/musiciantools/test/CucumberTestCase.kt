package org.mercuriete.musiciantools.test

import cucumber.api.CucumberOptions

@CucumberOptions(features = ["features"],
    glue = ["org.mercuriete.musiciantools.test"]
)

class CucumberTestCase
