package pe.gob.sunat.bdd.steps.execution;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(tags="@REQ-13", plugin={"pretty", "html:resultados_pruebas"}, glue="pe.gob.sunat.bdd.steps.definitions", 
						features ="src/test/resources/features")
public class RunCukesTest {
}