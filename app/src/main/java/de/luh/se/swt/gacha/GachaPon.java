package de.luh.se.swt.gacha;

import java.util.Arrays;
import java.util.List;

public class GachaPon {

    private List<Capsule> capsules;
    private double money;

    public GachaPon(Capsule... capsules) {
        this.capsules = Arrays.asList(capsules);
        this.money = 0;
    }

    public Capsule getRandomCapsule() {
        if (this.capsules.size() == 0) {
            return null;
        }
        return this.capsules.get((int)(Math.random() * this.capsules.size()));
    }

    public void refill(Capsule[] capsules) {
        this.capsules.addAll(Arrays.asList(capsules));
    }

    public void addMoney(double amount) {
        this.money += amount;
    }

    public double getMoney() {
        return this.money;
    }

}
