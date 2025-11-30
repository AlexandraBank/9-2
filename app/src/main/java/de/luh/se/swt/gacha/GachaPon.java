package de.luh.se.swt.gacha;

public class GachaPon {

    private Capsule[] capsules;

    public GachaPon(Capsule... capsules) {
        this.capsules = capsules;
    }

    public Capsule getRandomCapsule() {
        if (this.capsules.length == 0) {
            return null;
        }
        return this.capsules[(int)(Math.random() * this.capsules.length)];
    }

}
