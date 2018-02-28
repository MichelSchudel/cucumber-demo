package nl.craftsmen.cucumberdemo;

import cucumber.runtime.java.guice.ScenarioScoped;

@ScenarioScoped
public class StateHolder {

    public StateHolder() {
    }

    public Applicant applicant;

    public boolean result;
}
