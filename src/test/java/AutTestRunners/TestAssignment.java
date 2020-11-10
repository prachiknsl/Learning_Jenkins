package AutTestRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/AutFeatures/Assignment.feature",glue = "StepDefinations")
public class TestAssignment {

}
