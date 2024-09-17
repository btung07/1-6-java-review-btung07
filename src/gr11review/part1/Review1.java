package gr11review.part1;

import java.io.*;
import java.util.Scanner;

/* comments go here
 * 
 */
public class Review1 {


    public static void main(String[] args) throws IOException {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);
       
        // Number of days in each month for non-leap year
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
       
        // Get user input for month
        System.out.print("Enter the month number: ");
        int month = scanner.nextInt();
       
        // Get user input for day
        System.out.print("Enter the day number: ");
        int day = scanner.nextInt();
       
        // Validate month input
        if (month < 1 || month > 12) {
            System.out.println("Invalid month number. Please enter a number between 1 and 12.");
            scanner.close();
            return;
        }
       
        // Validate day input
        if (day < 1 || day > daysInMonth[month - 1]) {
            System.out.println("Invalid day number for month " + month + ". Please enter a valid day.");
            scanner.close();
            return;
        }
       
        // Calculate the day of the year
        int dayOfYear = 0;
        for (int i = 0; i < month - 1; i++) {
            dayOfYear += daysInMonth[i];
        }
        dayOfYear += day;
       
        // Output the result
        System.out.println(dayOfYear);
       
        // Close the scanner
        scanner.close();
    }
}
