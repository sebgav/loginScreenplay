package io.sailor.demo.stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.sailor.demo.questions.ProductWas;
import io.sailor.demo.taks.Add;
import io.sailor.demo.taks.Goto;
import io.sailor.demo.taks.Select;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
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
    public void heSelectsTheProductFromTheSections(DataTable data) {
theActorInTheSpotlight().attemptsTo(Select.theProduct(data));
    }

    @When("he adds the products to the cart whith")
    public void heAddsTheProductsToTheCartWhith(DataTable dataTable) {
        theActorInTheSpotlight().attemptsTo(Add.theProductoWithThe(dataTable));

    }

    @Then("he should see the added product in the cart")
    public void heShouldSeeTheAddedProductInTheCart() {
theActorInTheSpotlight().should(seeThat(ProductWas.Added()));
    }



}
