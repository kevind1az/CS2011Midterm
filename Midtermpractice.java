import java.util.Scanner;
public class Midtermpractice{
	public static void main(String[] args){
	Scanner value = new Scanner(System.in);
	int bowlingscore = 300;
	final int MINSCORE = 0;
	final int MAXSCORE = 300;
	System.out.println("What is your best bowling score?");
	String badInputString = null;
	while (!value.hasNextInt()) {
		badInputString = value.nextLine();
		System.out.println(badInputString + " isn't an integer!  Please try again.");
	}
	do {
		System.out.println("What is your best bowling score?");
		bowlingscore = value.nextInt();
	} while (bowlingscore > MAXSCORE || bowlingscore < MINSCORE);
		System.out.println("The user's best bowling score is " + bowlingscore);
	if (bowlingscore < 100 && bowlingscore >= 0)
		System.out.println("You are a poor bowler!!");
	else if (bowlingscore < 200 && bowlingscore >= 100)
		System.out.println("You are a competent bowler!!");
	else {
		System.out.println("You are a good bowler!!");
	}
	
	
	//end of part 1
	System.out.println("End of Part 1");
	
	
	System.out.println("");
	double weight;
	final double MINWEIGHT = 90.0;
	final double MAXWEIGHT = 300.0;
	System.out.println("What is your weight in pounds?");
	while (!value.hasNextDouble()) {
		badInputString = value.nextLine();
		System.out.println(badInputString + " isn't a double!  Please try again.");
	}
	do {
		System.out.println("What is your weight in pounds?");
		weight = value.nextDouble();
	} while (weight > MAXWEIGHT || weight < MINWEIGHT);
		System.out.println("The user's weight in pounds is " + weight);
	final double WEIGHTINKG = weight/2.205;
	System.out.println("The user's weight in kilograms is " + WEIGHTINKG);
	//end of part 2
	System.out.println("End of Part 2");
	System.out.println("");
	
	int distance;
	boolean nearby = true;
	System.out.println("How many miles do you live from campus?");
	while (!value.hasNextInt()) {
		badInputString = value.nextLine();
		System.out.println(badInputString + " isn't an integer!  Please try again.");
	}
	do {	
		distance = value.nextInt();
		if ( distance <= 5 && distance >= 0) {
			nearby = true;
			System.out.println(nearby + ", the user does live near campus");
		}
		else if (distance > 5) {
			nearby = false;
			System.out.println(nearby + ", the user does not live near campus");
		}
		else {
			System.out.println("Try again!");
		}
	} while (distance < 0);

	
	int height;
	boolean tallness = true;
	System.out.println("How tall are you in inches?");
	while (!value.hasNextInt()) {
		badInputString = value.nextLine();
		System.out.println(badInputString + " isn't an integer!  Please try again.");
	}
	do {	
		height = value.nextInt();
		if (height >= 70) {
			tallness = true;
			System.out.println(tallness + ", the user is defined to be tall due to being taller than 5'10");
		}
		else if (height < 70) {
			tallness = false;
			System.out.println(tallness + ", the user is not defined as tall due to being shorter than 5'10");
		}
		else {
			System.out.println("Try again!");
		}
	} while (height < 0);
	
	if ( tallness == true && nearby == true) {
		System.out.println("The user both lives nearby or is taller than 5'10");
	}
	else if ( tallness == true || nearby == true) {
		System.out.println("The user either lives nearby or is taller than 5'10");
	}
	else {
		System.out.println("The user neither lives nearby or is taller than 5'10");
	}
	if (tallness == nearby) {
		System.out.println("The user has the same output for both booleans");
	}
	else {
		System.out.println("The user does not have the same output for both booleans");
	}
	}
}