package com.qa.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "features", 
			glue = { "com.qa.stepdefinitions" }, 
			plugin = { "pretty",
		"html:target/htmlReport", "json:target/jsonReport/jsonReport.json",
		"junit:target/xmlReport/xmlReport.xml" } // to generate different type of report
		, monochrome = true // display the console output in a proper readable format
		, strict = false // Test will fail if any step is not defined in step definition file
		, dryRun = false // make it true to check the mapping is proper between feature file and step def
							// file
		, tags = "@tag")
public class Runner {
	
} 
