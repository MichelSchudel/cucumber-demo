package nl.craftsmen.cucumberdemo;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class ApplicantTest {

    @Test
    public void underagedApplicantShouldNotBeEligableForLoan() {
        Applicant applicant = new Applicant("michel", 41000, 17, 1);
        boolean actual = applicant.eligibleForLoan();
        assertThat(actual).isFalse();
    }

    @Test
    public void applicantWithSmallIncomeShouldNotBeEligableForLoan() {
        Applicant applicant = new Applicant("michel", 5000, 18, 3);
        assertThat(applicant.eligibleForLoan()).isFalse();
    }

}
