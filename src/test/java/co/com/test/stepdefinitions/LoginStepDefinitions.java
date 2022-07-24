package co.com.test.stepdefinitions;

import co.com.test.questions.LoginMailWas;
import co.com.test.questions.LoginPassWord;
import co.com.test.taks.GotoPage;
import co.com.test.taks.RegisterPassword;
import co.com.test.taks.RegiterUser;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginStepDefinitions {

    @Before
    public void setTheStage()
    {
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("that {string} has opened the page the email")
    public void thatHasOpenedThePageTheEmail(String actorName) {
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorCalled(actorName).wasAbleTo(GotoPage.theMail());
    }

    @When("he enter the login data correct")
    public void heEnterTheLoginDataCorrect(DataTable data) {
        List<Map<String, String>> values =data.asMaps(String.class,String.class);

        theActorInTheSpotlight().attemptsTo(RegiterUser.login(values.get(0).get("user")));
        theActorInTheSpotlight().attemptsTo(RegisterPassword.login(values.get(0).get("password")));
        theActorInTheSpotlight().remember("password",values.get(0).get("password"));
    }
    @When("he enter the login data with password incorrect")
    public void heEnterTheLoginDataWithPasswordIncorrect(DataTable data) {
        List<Map<String, String>> values =data.asMaps(String.class,String.class);

        theActorInTheSpotlight().attemptsTo(RegiterUser.login(values.get(0).get("user")));
        theActorInTheSpotlight().attemptsTo(RegisterPassword.login(values.get(0).get("password")));

    }

    @Then("you should see my gmail account")
    public void youShouldSeeMyGmailAccount() {
        // Write code here that turns the phrase above into concrete actions
        theActorInTheSpotlight().should(seeThat(LoginMailWas.In()));
    }
    @Then("you should see a message of warning")
    public void youShouldSeeAMessageOfWarning() {
        // Write code here that turns the phrase above into concrete actions
theActorInTheSpotlight().should(seeThat(LoginPassWord.Bad()));
    }











}
