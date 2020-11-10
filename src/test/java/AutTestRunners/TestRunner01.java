package AutTestRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/AutFeatures/Fe01.feature",glue = "StepDefinations")
public class TestRunner01 {

}
