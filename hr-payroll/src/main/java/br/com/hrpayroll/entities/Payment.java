package br.com.hrpayroll.entities;

public class Payment {

    private String name;

    private Double dailyIncome;

    private Integer days;

    @Deprecated
    public Payment(){

    }

    public Payment(String name, Double dailyIncome, Integer days) {
        this.name = name;
        this.dailyIncome = dailyIncome;
        this.days = days;
    }

    public String getName() {
        return name;
    }

    public Double getDailyIncome() {
        return dailyIncome;
    }

    public Integer getDays() {
        return days;
    }


    // methods

    public double getTotal(){
        return days * dailyIncome;
    }


}
