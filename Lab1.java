//Jordan Archuleta 

import java.util.Scanner;

public class Lab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("What is your zodiac? Enter your birthday month followed by the day as numbers.");
		Scanner keyboard = new Scanner(System.in);
		int month = keyboard.nextInt();
		int day = keyboard.nextInt();
		if(month ==3)
			if(day >=31) {
				System.out.println("Invalid day of month");
			}
			else if(day >= 21){

				System.out.println("you are an aries");
			} else if(day <= 20 ){

				System.out.println("you are a pisces");
			} else{

				System.out.println("you are not an aries");
			}

		if(month == 4)
			if(day >=31) {
				System.out.println("Invalid day of month");
			}
			else if(day >= 20) {
				System.out.println("you are a taurus");
			}
			else if(day <= 19) {
				System.out.println("you are an aries");
			}
		
		if(month == 5)
			if(day >= 32) {
				System.out.println("Invalid day of month");
			}
			else if(day <= 20) {
				System.out.println("you are a taurus");
			}
			else if(day >= 21) {
				System.out.println("you are a gemini");
			}
		if(month == 6)
			if(day >=31) {
				System.out.println("Invalid day of month");
			}
			else if(day <=20) {
				System.out.println("you are a gemini");
			}
			else if(day >= 21) {
				System.out.println("you are a cancer");
			}
		if(month == 7)
			if(day >=32) {
				System.out.println("Invalid day of month");
			}
			else if(day <= 22) {
				System.out.println("you are a cancer");
			}
			else if(day >= 23) {
				System.out.println("you are a leo");
			}
		if(month == 8)
			if(day >= 32) {
				System.out.println("Invalid day of month");
			}
			else if(day <=22) {
				System.out.println("you are a leo");
			}
			else if(day >= 23 ) {
				System.out.println("you are a virgo");
			}
		if(month == 9) 
			if(day >= 32) {
				System.out.println("Invalid day of month");
			}
			else if(day <= 22) {
				System.out.println("you are a virgo");
			}
			else if(day >= 23) {
				System.out.println("you are a libra");
			}
		if(month == 10)
			if(day >= 31) {
				System.out.println("Invalid day of month");
			}
			else if(day <= 22) {
				System.out.println("you are a libra");
			}
			else if(day >= 23) {
				System.out.println("you are a scorpio");
			}
		if(month == 11)
			if(day >= 30) {
				System.out.println("Invalid day of month");
			}
			else if(day <=21) {
				System.out.println("you are a scorpio");
			}
			else if(day >= 22) {
				System.out.println("you are a sagittarius");
			}
		if(month == 12)
			if(day >= 32) {
				System.out.println("Invalid day of month");
			}
			else if(day <= 21) { 
				System.out.println("you are a sagittarius");
			}
			else if(day >= 22) {
				System.out.println("you are a capricorn");
			}
		if(month == 1)
			if(day >= 32) {
				System.out.println("Invalid day of month");
			}
			else if(day <= 19) {
				System.out.println("you are a capricorn");
			}
			else if(day >= 20) { 
				System.out.println("you are an aqaurius");
			}
		if(month == 2)
			if(day >= 30) {
				System.out.println("you are an aquarius");
			}
			else if(day >= 18) {
				System.out.println("you are a pisces");
			}
		if(month >=13) {
			System.out.println("Invalid month");
		}
	}  //end of main 

	//end of class 
}
