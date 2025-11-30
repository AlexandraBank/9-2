package de.luh.se.swt.options;

public class UsedOption extends Option {
    
    private String value;

    public UsedOption(Option parentOption, String value) {
        super(parentOption.getName(), parentOption.isFlag());
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

    @Override
    public String toString() {
        return "UsedOption (" + this.getName() + ", " + this.value + ")";
    }
}
