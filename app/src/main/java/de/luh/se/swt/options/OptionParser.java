package de.luh.se.swt.options;

import java.util.ArrayList;
import java.util.Arrays;

public class OptionParser {
    
    private ArrayList<Option> registeredOptions; 
    private ArrayList<UsedOption> usedOptions; 

    public OptionParser(String[] args, Option ...options) {
        this.usedOptions = new ArrayList<>();
        this.registeredOptions = new ArrayList<>();
        
        this.registeredOptions.addAll(Arrays.asList(options));
        this.parse(args);
    }

    private void parse(String[] args) {
        for (String arg : args) {
            for (Option option : this.registeredOptions) {
                if (arg.startsWith(option.getName())) {
                    if (option.isFlag()) {
                        this.usedOptions.add(new UsedOption(option, Option.FLAG_VALUE));
                    } else if (arg.contains("=")) {
                        try {
                            this.usedOptions.add(new UsedOption(option, arg.split("=")[1]));
                        } catch (IndexOutOfBoundsException e) {
                            // handle
                            continue;
                        }
                    } else {
                        // throw error
                        continue;
                    }
                }
            }
        }
    }

    public boolean hasOption(String optionName) {
        return this.getOption(optionName) != null;
    }

    public UsedOption getOption(String optionName) {
        for (UsedOption o : this.usedOptions) {
            if (o.getName().equals(optionName)) {
                return o;
            }
        }
        return null;
    }

    public ArrayList<UsedOption> getOptions() {
        return this.usedOptions;
    }
}
