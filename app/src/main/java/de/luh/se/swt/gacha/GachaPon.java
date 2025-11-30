package de.luh.se.swt.gacha;

public class GachaPon {

    private Capsule[] capsules;

    public GachaPon(Capsule... capsules) {
        this.capsules = capsules;
    }

    public Capsule getRandomCapsule() {
        return this.capsules[(int)(Math.random() * this.capsules.length)];
    }

}
