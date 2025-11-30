package de.luh.se.swt;

import java.util.Scanner;

import de.luh.se.swt.gacha.*;
import de.luh.se.swt.options.*;

public class Main {
	
	public static void main(String[] args) {
		OptionParser parser = new OptionParser(args, 
			new Option("--help", true),
			new Option("--money", false)
		);

		GachaPon pon = new GachaPon(
			new Capsule("[Banana for Scale]"),
			new Capsule("[Laptop Fan at Takeoff Speed]"),
			new Capsule("[Unhelpful Wizard]"),
			new Capsule("[One Perfectly Normal Brick]"),
			new Capsule("[Mystery Box]"),
			new Capsule("[Infinite Undo Button]"),
			new Capsule("[The Eternal TODO]"),
			new Capsule("[Figure of Missingno]"),
			new Capsule("[Debug Mode Enabled]"),
			new Capsule("[Figure of Kent Beck]"),
			new Capsule("[Unallocated Memory Block]"),
			new Capsule("[Haunted Keyboard]"),
			new Capsule("[Weekend Update That Broke Everything]"),
			new Capsule("[Java (yes, the whole island)]"),
			new Capsule("[Coffee-Stain Artifact]"),
			new Capsule("[Cursed Flowchart]"),
			new Capsule("[Forbidden Snack]"),
			new Capsule("[Actual Kent Beck]"),
			new Capsule("[Recyclable Vibes]"),
			new Capsule("[Unreasonably Loud Mouse]"),
			new Capsule("[Invisible Banana Peel]"),
			new Capsule("[Figure of Capsule]"),
			new Capsule("[Flat Earth (foldable)]"),
			new Capsule("[GPS That Lies]"),
			new Capsule("[Half-Pixel]"),
			new Capsule("[Legendary Coffee Mug]"),
			new Capsule("[Currywurst + Pommes]"),
			new Capsule("[Nostalgic Dial-Up Tone]"),
			new Capsule("[Premium Placeholder Text]"),
			new Capsule("[Figure of Bonus-Punkte]"),
			new Capsule("[Spaghetti Code (literal)]"),
			new Capsule("[Five G but Actually 2G]"),
			new Capsule("[Bag of Schrödinger’s Snacks]"),
			new Capsule("[Chair (slightly broken)]"),
			new Capsule("[Overengineered Spoon]"),
			new Capsule("[Figure of Linus Torvalds]"),
			new Capsule("[Figure of Tux]"),
			new Capsule("[Expired Coupon]"),
			new Capsule("[Invisible Trophy]"),
			new Capsule("[Quantum Sandwich]"),
			new Capsule("[Extra Null Pointer]"),
			new Capsule("[Ueberrschungs-Ei]"),
			new Capsule("[Dramatic Goose]"),
			new Capsule("[Gluten-Free Bytes]"),
			new Capsule("[Not-So-Random Number]"),
			new Capsule("[Figure of Figure]"),
			new Capsule("[Backup Plan B (still bad)]"),
			new Capsule("[AI-Generated Sandwich]"),
			new Capsule("[NPC Dialogue Option]"),
			new Capsule("[Legendary Rubber Band]"),
			new Capsule("[Premium Second Monitor]"),
			new Capsule("[Miniature TARDIS]"),
			new Capsule("[Hamburger]"),
			new Capsule("[Trial Version of Happiness]"),
			new Capsule("[Figure of You]"),
			new Capsule("[Baguette of Doom]"),
			new Capsule("[Royal Rubber Chicken]"),
			new Capsule("[Figure of Java]"),
			new Capsule("[Figure of Spekulatius]"),
			new Capsule("[Dramatic Loading Bar]"),
			new Capsule("[Half-Eaten Donut]"),
			new Capsule("[Pedantically Correct Owl]"),
			new Capsule("[Tinfoil Hat (limited edition)]"),
			new Capsule("[Shiny Potato]"),
			new Capsule("[Wasted]"),
			new Capsule("[Outdated BIOS Chip]"),
			new Capsule("[Haunted USB-C Port]"),
			new Capsule("[Spekulatius x1]"),
			new Capsule("[The letter 'i']"),
			new Capsule("[Unhelpful Error Message]"),
			new Capsule("[Architectural Diagram of Nothing]"),
			new Capsule("[Figure of actual book]"),
			new Capsule("[Sauerkraut Deluxe]"),
			new Capsule("[Cat-Approved Object]"),
			new Capsule("[Totally Normal Rock]"),
			new Capsule("[Lasagne]"),
			new Capsule("[Spicy Water]"),
			new Capsule("[Low Battery Warning]"),
			new Capsule("[Python (not the language)]"),
			new Capsule("[Bottle of Undefined Behavior]"),
			new Capsule("[Unallocated Memory Block]"),
			new Capsule("[Megaw-Ultra-Deluxe Pen]"),
			new Capsule("[Quantum Entangled Socks]"),
			new Capsule("[Train (actually)]"),
			new Capsule("[Ice's Juice Box]"),
			new Capsule("[Skittles]"),
			new Capsule("[Cursed USB Stick]"),
			new Capsule("[Emoji That Doesn't Exist]"),
			new Capsule("[Non-Euclidean Sandwich]"),
			new Capsule("[Keyboard Warrior Helmet]"),
			new Capsule("[Overengineered Spoon]"),
			new Capsule("[Extra Crispy Toast]"),
			new Capsule("[Shiny Potato]"),
			new Capsule("[404: Item Not Found]"),
			new Capsule("[Figure of Horse]"),
			new Capsule("[Figure of Elisa]"),
			new Capsule("[Figure of Lucas]"),
			new Capsule("[Figure of Cedric]"),
			new Capsule("[Figure of Marc]"),
			new Capsule("[USB Plug (first try)]"),
			new Capsule("[Reversible Pancake]"),
			new Capsule("[Infinite Loop in a Box]"),
			new Capsule("[Figure of Capsule]"),
			new Capsule("[Capsule of Figure (with Figure inside)]"),
			new Capsule("[Floppy Disk of Wisdom]"),
			new Capsule("[AI That Apologizes Too Much]"),
			new Capsule("[The Eternal TODO]"),
			new Capsule("[Spaghetti Code (literal)]"),
			new Capsule("[Patch Tuesday in Capsule Form]"),
			new Capsule("[Sauerkraut Deluxe]"),
			new Capsule("[WiFi (2 bars)]"),
			new Capsule("[Ghost of Semicolons Past]"),
			new Capsule("[Out-of-Bounds Cookie]"),
			new Capsule("[Mystical Hotfix]"),
			new Capsule("[Debugging Fairy]"),
			new Capsule("[Abandoned Shopping Cart]"),
			new Capsule("[Rubber Duck (consultant)]"),
			new Capsule("[Intel inside]"),
			new Capsule("[Slightly Bent Paperclip]"),
			new Capsule("[Screaming Spreadsheet]"),
			new Capsule("[5G but Actually 2G]"),
			new Capsule("[Corporate Unicorn]"),
			new Capsule("[Very Small Planet]"),
			new Capsule("[🪦]"),
			new Capsule("[Dinosaur Emoji (real)]"),
			new Capsule("[Premium Air]"),
			new Capsule("[Forgotten Password (legendary)]"),
			new Capsule("[Half-Pixel]"),
			new Capsule("[Bug (pet)]"),
			new Capsule("[Mysteriously Sticky Note]"),
			new Capsule("[Architectural Diagram of Nothing]"),
			new Capsule("[Skittles]"),
			new Capsule("[Figure of Prof. Schneider]"),
			new Capsule("[Banana for Scale]"),
			new Capsule("[Cake (a lie)]"),
			new Capsule("[Unhelpful Wizard]"),
			new Capsule("[Infinite Undo Button]"),
			new Capsule("[Chair (slightly broken)]")
		);

		Player player = new Player(100);

		UsedOption money = parser.getOption("--money");
		if (money != null) {
			int moneyValue = Integer.parseInt(money.getValue());
			player.setMoney(moneyValue);
		}

		boolean isPlaying = true;
		Scanner scanner = new Scanner(System.in);
		while (isPlaying) {

			String line = scanner.nextLine();
			if (line.equalsIgnoreCase("exit")) {
				isPlaying = false;
				break;
			}

			if (line.equalsIgnoreCase("gamble")) {
				player.chargeMoney(1);
				pon.addMoney(1);
				Capsule capsule = pon.getRandomCapsule();

				System.out.println("You got a: " + capsule.open());
			}
		}
	}
}
