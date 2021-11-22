package com.company.employee;

import java.util.HashMap;

public class Dealer extends Employee{

    private final Experience experience;
    private static final String paymentPeriod = "daily";
    private final HashMap<Experience, Double> dealerPayment = new HashMap<>();

    public Dealer(String name, Experience experience) {
        super(name, paymentPeriod);
        this.experience = experience;
        createDealerPayment();
    }

    private void createDealerPayment(){
        dealerPayment.put(Experience.NEWBIE, 50.000);
        dealerPayment.put(Experience.MIDLEVEL, 80.000);
        dealerPayment.put(Experience.PRO, 120.000);
    }

    public HashMap<Experience, Double> getDealerPayment() {
        return dealerPayment;
    }

    public double getDailySalary(Experience experience){
        return dealerPayment.get(experience);
    }

    public Experience getExperience() {
        return experience;
    }
}
