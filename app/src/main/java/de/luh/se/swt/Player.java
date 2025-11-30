package de.luh.se.swt;

public class Player {
    
    private double money;

    public Player(double money) {
        this.money = money;
    }

    public double getMoney() {
        return this.money;
    }

    public void chargeMoney(double amount) {
        this.money -= amount;
    }

    public void setMoney(double amount) {
        this.money = amount;
    }

}
