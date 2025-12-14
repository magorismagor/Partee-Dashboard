package com.yneeds.partee.dashboard.cucumber;

import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@Suite
@IncludeEngines("cucumber")
@SelectPackages("com.yneeds.partee.dashboard.cucumber")
class CucumberTest {}
