package io.sailor.demo.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.sailor.demo.taks.Goto;
import io.sailor.demo.taks.Select;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class CartStepDefinitions {

    @Before
    public void setTheStage()
    {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("that {string} has opened the ecommerce")
    public void thatHasOpenedTheEcommerce(String actorName) {
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorCalled(actorName).wasAbleTo(Goto.theUrl());
    }




    @When("he selects the product from the sections")
    public void heSelectsTheProductFromTheSections(io.cucumber.datatable.DataTable data) {
theActorInTheSpotlight().attemptsTo(Select.theProduct(data));
    }

    @When("he adds the products to the cart whith")
    public void heAddsTheProductsToTheCartWhith(io.cucumber.datatable.DataTable dataTable) {
     //   theActorInTheSpotlight().attemptsTo();

    }

    @Then("he should see the added product in the cart")
    public void heShouldSeeTheAddedProductInTheCart() {
//theActorInTheSpotlight().should(seeThat(""));
    }



}
