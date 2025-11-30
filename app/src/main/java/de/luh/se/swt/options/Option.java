package de.luh.se.swt.options;

public class Option {

    public static String FLAG_VALUE = "true";
    
    private String name;
    private boolean isFlag;

    public Option(String name, boolean isFlag) {
        this.name = name;
        this.isFlag = isFlag;
    }

    public String getName() {
        return this.name;
    }

    public boolean isFlag() {
        return this.isFlag;
    }

}
