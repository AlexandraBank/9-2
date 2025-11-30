package de.luh.se.swt;

import de.luh.se.swt.options.*;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("HÜ9 Startet...");
		OptionParser parser = new OptionParser(args, 
			new Option("--help", true),
			new Option("--lmao", false)
		);
	}
}
