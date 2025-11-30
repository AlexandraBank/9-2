package de.luh.se.swt;

import de.luh.se.swt.options.*;

public class Main {
	
	public static void main(String[] args) {
		OptionParser parser = new OptionParser(args, 
			new Option("--help", true),
			new Option("--money", false)
		);

		Player player = new Player(100);

		UsedOption money = parser.getOption("--money");
		if (money != null) {
			int moneyValue = Integer.parseInt(money.getValue());
			player.setMoney(moneyValue);
		}
	}
}
