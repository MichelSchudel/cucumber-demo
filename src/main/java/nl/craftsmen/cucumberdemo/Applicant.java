package nl.craftsmen.cucumberdemo;

public class Applicant {

    private String name;
    private int yearlyIncome;
    private int age;
    private int yearsOfEmployment;

    public Applicant(String name, int yearlyIncome, int age, int yearsOfEmployment) {
        this.name = name;
        this.yearlyIncome = yearlyIncome;
        this.age = age;
        this.yearsOfEmployment = yearsOfEmployment;
    }

    public boolean eligibleForLoan() {
        return age >= 18 && yearsOfEmployment >= 3 && yearlyIncome >= 10_000 & yearlyIncome <= 100_000;

    }
}
