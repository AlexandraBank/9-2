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

}
