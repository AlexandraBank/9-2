package de.luh.se.swt.gacha;

import java.util.Arrays;
import java.util.List;

public class GachaPon {

    private List<Capsule> capsules;

    public GachaPon(Capsule... capsules) {
        this.capsules = Arrays.asList(capsules);
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

}
