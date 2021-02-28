
package com.qa.runner;
        import io.cucumber.testng.CucumberOptions;


/**
 * An example of using TestNG when the test class does not inherit from
 * AbstractTestNGCucumberTests but still executes each scenario as a separate
 * TestNG test.
 */
@CucumberOptions(
        plugin = {"pretty"
                , "html:target/Chandan One+5/cucumber"
                , "summary"
                , "de.monochromata.cucumber.report.PrettyReports:target/Chandan One+5/cucumber-html-reports"}
        ,features = {"src/test/resources"}
        ,glue = {"com.qa.stepdef"}
        ,dryRun=false
        ,monochrome=true
        ,strict=true
        ,tags = "@test"
)
    public class MyonePlusTestNGRunnerTest extends RunnerBase {
    }



