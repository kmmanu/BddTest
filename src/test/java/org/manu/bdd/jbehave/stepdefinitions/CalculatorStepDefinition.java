package org.manu.bdd.jbehave.stepdefinitions;

import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.Alias;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.json.JSONException;
import org.junit.Assert;
import org.manu.bdd.jbehave.steps.CalculatorSteps;

public class CalculatorStepDefinition {

	@Steps
	CalculatorSteps calculatorSteps;

	private int num1;
	private int num2;
	private Object sum;

	@Given("two numbers <a> <b>")
	@Alias("two numbers $a $b")
	public void givenAUrl(final int a, final int b) {
		this.num1 = a;
		this.num2=b;
	}

	@When("I request the sum")
	public void sum() {
		this.sum = this.calculatorSteps.add(this.num1,this.num2);
	}

	@Then("I should obtain the following result: $expectedSum")
	public void shouldObtainJsonMessage(final int expectedSum) throws JSONException {
		Assert.assertEquals(expectedSum, this.sum);
	}
}
