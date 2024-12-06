// Written by Jordan Archuleta 
import java.util.Scanner;

public class Temp {

	public static void main(String[] args) {

		System.out.println("Welcome to the below average temperature tester program");

		int[] temperatures = new int[10];

		for (int i = 0; i < temperatures.length; i++) {
			System.out.println("Please enter the temperature for day " + (i + 1));

			Scanner keyboard = new Scanner(System.in);

			int number = keyboard.nextInt();

			temperatures[i] = number;

		}
		int sum = 0; 

		for (int i = 0; i < temperatures.length; i++) {
			sum += temperatures[i];
		}

		double average = (double) sum / temperatures.length;

		System.out.println("Average: " + average);


	}

}
