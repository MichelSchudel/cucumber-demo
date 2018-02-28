package nl.craftsmen.cucumberdemo;

import com.google.inject.Inject;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class EmployeeStepDefs {


    @Inject
    private StateHolder stateHolder;

    @Given("^an underaged applicant")
    public void anUnderagedApplicant() {
        stateHolder.applicant = new Applicant("michel", 41000, 17, 1);
    }

    @When("^a loan is asked$")
    public void aLoanIsAsked() {
        stateHolder.result = stateHolder.applicant.eligibleForLoan();
    }

    @Then("^the applicant should not be eligible$")
    public void theApplicantShouldNotBeEligible() {
        assertThat(stateHolder.result).isFalse();
    }

    @Then("^the applicant should be eligible$")
    public void theApplicantShouldBeEligible() {
        assertThat(stateHolder.result).isTrue();
    }

    @Given("^an applicant with an income of (\\d+) a year$")
    public void anApplicantWithAnIncomeOfAYear(int yearlyIncome) throws Throwable {
        stateHolder.applicant = new Applicant("michel", yearlyIncome, 18, 3);
    }

    @Given("^an applicant with a temporay contract$")
    public void anApplicantWithATemporayContract() throws Throwable {
        stateHolder.applicant = new Applicant("michel", 41000, 18, 1);
    }

    @Given("^an normal applicant$")
    public void anNormalApplicant() {
        stateHolder.applicant = new Applicant("michel", 41000, 18, 3);
    }


    @Given("^an applicant with income \"([^\"]*)\" and age \"([^\"]*)\" and \"([^\"]*)\" of working$")
    public void an_applicant_with_incdome_and_age_and_of_working(int income, int age, int years) throws Exception {
        stateHolder.applicant = new Applicant("michel", income, age, years);
    }

    @Then("^the request should be \"([^\"]*)\"$")
    public void theRequestShouldBeResult(boolean result) {
        assertThat(result).isEqualTo(stateHolder.applicant.eligibleForLoan());
    }

}
