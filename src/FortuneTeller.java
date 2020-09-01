import java.util.Scanner;
//for a sout print delay
import java.util.concurrent.TimeUnit;

public class FortuneTeller {

	public static void main(String[] args) {
		System.out.println("I am the all powerful Zoltar!");
		System.out.println("It is time to tell your fortune....");
		Scanner input = new Scanner(System.in);

		System.out.println("Enter your first name: ");
		String firstName = input.nextLine();

		System.out.println("Enter your last name: ");
		String lastName = input.nextLine();

		System.out.println("Enter your age: ");
		// make sure it's a number
		while (!input.hasNextInt()) {
			System.out.println("That's not a number!");
			// advance the scanner
			input.next();
		}
		int age = input.nextInt();

		System.out.println("Enter the number of the month you were born: ");
		System.out.println("  (ex: Jan = 1, Feb = 2, Dec = 12, etc)");
		while (!input.hasNextInt()) {
			System.out.println("That's not a number!");
			input.next();
		}
		int month = input.nextInt();

		// define the favColor string
		String favColor;

		// ask for the favorite color. if it matches, move on, if not, enter the loop
		System.out.println("Enter your favorite ROYGBIV color");
		System.out.println("  or 'help' to learn more about these colors:");
		favColor = input.nextLine();

		// start the loop. If the colors do not equal one of the rainbow....ignoring the
		// case.
		while (!favColor.equalsIgnoreCase("red") && !favColor.equalsIgnoreCase("orange")
				&& !favColor.equalsIgnoreCase("yellow") && !favColor.equalsIgnoreCase("green")
				&& !favColor.equalsIgnoreCase("blue") && !favColor.equalsIgnoreCase("indigo")
				&& !favColor.equalsIgnoreCase("violet")) {

			// if help is typed, display the help text
			if (favColor.equalsIgnoreCase("help")) {
				System.out.println("ROYGBIV stands for the sequence of colors making up a rainbow.");
				System.out.println("  Red \n  Orange \n  Yellow \n  Green \n  Blue \n  Indigo \n  Violet");
				System.out.println("");
				System.out.println("Enter your favorite ROYGBIV color");
				System.out.println("  or 'help' to learn more about these colors:");
				favColor = input.nextLine().toLowerCase();

				// otherwise, the color is invalid and must be entered again
			} else {
				System.out.println(favColor + " is not a ROYGBIV color. Please try again.  ");
				favColor = input.nextLine().toLowerCase();
			}
		}

		// how many siblings
		System.out.println("How many siblings do you have?");
		while (!input.hasNextInt()) {
			System.out.println("That's not a number!");
			input.next();
		}
		int siblings = input.nextInt();

		// close the input
		input.close();

		// let's see if the age is divisible by 2. If so, it's an even number.
		// define the retirementYears, and determine odd or even to the output
		String retirementYears = "";
		if (age % 2 == 0) {
			// if even
			retirementYears = "70 Years";
		} else {
			// if odd
			retirementYears = "1 year";
		}

		// define vacationHome location by each number
		String vacationHome = "";
		if (siblings == 0) {
			vacationHome = "space aboard an Imperial Star Destroyer";
		} else if (siblings == 1) {
			vacationHome = "Hogsmeade near Hogwarts";
		} else if (siblings == 2) {
			vacationHome = "the neighborhood of the Fortress of Solitude";
		} else if (siblings == 3) {
			vacationHome = "your Happy Place";
		} else if (siblings > 3) {
			vacationHome = "the Phantom Zone";
		} else if (siblings < 0) {
			vacationHome = "Hell watching The View next to the super high unreachable cupcake table";
		}

		// define the mode of transport
		// let's use switch for some practice on something else
		String transport = "";
		switch (favColor) {
		case "red":
			transport = "Star Destroyer";
			break;
		case "orange":
			transport = "Invisible Airplane";
			break;
		case "yellow":
			transport = "Pumpkin Carriage";
			break;
		case "green":
			transport = "X-Wing Fighter";
			break;
		case "blue":
			transport = "Super Speed";
			break;
		case "indigo":
			transport = "Transporter";
			break;
		case "violet":
			transport = "Port Key";
			break;
		}

		// define the bankBalance if greater than or equal to the month number entered
		String bankBalance = "";
		if (month >= 1 && month <= 4) {
			bankBalance = "$1,234,567.00";
		} else if (month >= 5 && month <= 8) {
			bankBalance = "$987,654,321.00";
		} else if (month >= 9 && month <= 12) {
			bankBalance = "$3.14";
		} else {
			bankBalance = "absolutely NOTHING";
		}

		System.out.println("Standby....fortune being told");
		System.out.println(".");
		System.out.println(". .");
		System.out.println(". . .");
		System.out.println(". . . .");
		System.out.println(". . . . .");
		System.out.println(firstName + " " + lastName + "\nwill retire in " + retirementYears + "\nwith " + bankBalance
				+ " in the bank, \na vacation home in " + vacationHome + ", \nand travel by " + transport + ".");

	}

}
