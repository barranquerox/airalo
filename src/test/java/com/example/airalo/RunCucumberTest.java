package com.example.airalo;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
    features = {"src/test/resources/features"},
    plugin = {
        "html:target/results.html",
        "message:target/results.ndjson",
    })
public class RunCucumberTest extends AbstractTestNGCucumberTests {

  @DataProvider(parallel = true)
  @Override
  public Object[][] scenarios() {
    return super.scenarios();
  }

}