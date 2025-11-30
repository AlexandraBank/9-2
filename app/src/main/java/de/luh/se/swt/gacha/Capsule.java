package de.luh.se.swt.gacha;

public class Capsule {
    
    private boolean isOpen;
    private Object object;

    public Capsule(Object o) {
        this.isOpen = false;
        this.object = o;
    }

    public Object open() {
        if (this.isOpen) {
            return null;
        }
        this.isOpen = true;
        return this.object;
    }

}
