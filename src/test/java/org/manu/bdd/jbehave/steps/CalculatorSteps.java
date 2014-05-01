package org.manu.bdd.jbehave.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import org.manu.bdd.jbehave.calculator.Calculator;


public class CalculatorSteps extends ScenarioSteps {

	Calculator calculator = new Calculator();

	public CalculatorSteps() {
	}

	@Step("Shorten Url for longUrl={0}")
	public int add(final int num1, final int num2) {
		return this.calculator.add(num1, num2);
	}
}
