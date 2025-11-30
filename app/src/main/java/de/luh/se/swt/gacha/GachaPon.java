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

        int index = (int)(Math.random() * this.capsules.size());
        Capsule c = this.capsules.get(index);

        this.capsules.remove(index);
        return c;
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
