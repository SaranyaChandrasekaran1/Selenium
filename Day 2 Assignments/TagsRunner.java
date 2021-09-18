package tagsRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/tagsfeature",
glue="stepsone",
monochrome = true,
publish = true,
tags="@smoke and @sanity")
public class TagsRunner extends AbstractTestNGCucumberTests {

}
