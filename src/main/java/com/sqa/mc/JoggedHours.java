/**
 * File Name: JoggedHours.java<br>
 * Cassetta, Mark<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Oct 6, 2017
 */
package com.sqa.mc;

import java.util.*;

import com.sqa.mc.helpers.*;

/**
 * JoggedHours
 * <p>
 * Create an application which logs jogged hours into the system. The
 * application should do the following steps: <br>
 * 1. Welcome the user to the application. <br>
 * 2. Ask the user what the registered jogger's name is. <br>
 * 3. Ask the user how many days the person being logged or jogger has jogged
 * this week (max 7). <br>
 * 4. For each day accounted for, ask user how many hours the jogger has jogged.
 * 5. Calculate the total hours the jogger has jogged for the week. <br>
 * 6. Let the user know how many hours are logged for the week for that jogger.
 * 7. Echo a farewell message to the user. <br>
 * 8. Exit the application.
 * <p>
 * Additional Features: Calculate the average number of hours jogged during this
 * week for the jogger. Distinguish if the jogger is an Amateur Jogger/
 * Efficient Jogger/ or Extremist Jogger. Amateur is under 15 hours, Efficient
 * is 15-40 hours, and an Extremist is over 40. Have the program continue
 * execution until they do not want to log any more joggers into the system. To
 * compare Strings you must use equals() method or equalsIgnoreCase()
 *
 * @author Cassetta, Mark
 * @version 1.0.0
 * @since 1.0
 */
public class JoggedHours {

	public static String appName = "Logged Jogged Hours";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String name = AppBasics.greetUserAndGetName(appName);
		totalHoursJogged();
		AppBasics.farewellUser(name, appName);
	}

	/**
	 *
	 */
	private static void totalHoursJogged() {
		String joggerName;
		Scanner input = new Scanner(System.in);
		System.out.println("What is the name of the jogger being logged?");
		joggerName = input.next();
		int numOfDays = AppBasics.requestInt("How many days did " + joggerName + " jog in the last week?", 1, 7);
		double hoursPerDay = 0;
		for (int i = 0; i < numOfDays; i++) {
			hoursPerDay += AppBasics.requestInt("How many hours did " + joggerName + " jog on day " + (i + 1));
		}
		double totalHours = hoursPerDay;   // how do i separate each day's hours
										   // when entered by user
		System.out.println("Total hours jogged: " + totalHours);
		double avgHours = hoursPerDay % numOfDays;
		System.out.println("Average hours jogged per day: " + avgHours);
		if (avgHours > 40) {
			System.out.println("Jogging level: Extremist");
		} else if (avgHours > 14) {
			System.out.println("Jogging level: Efficient");
		} else if (avgHours > 0) {
			System.out.println("Jogging level: Amateur");
		}
		System.out.println("Would you like to log another jogger? ");
		String ans = input.next();
		ans = ans.equalsIgnoreCase(yes, no, y, n); // cannot get this to work.
	}
}
