package com.guru99.demo.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = {"src/test/java/com/guru99/demo/features"},

        glue     = {"com/guru99/demo/stepDefinitions","com/guru99/demo/hooks"},

        plugin = {"pretty", "json:target/report.json","html:target/htmlReport/report.html",
                "html:target/cucumber-reports"},
        monochrome = true
)



public class LoginTestRunner {

}
