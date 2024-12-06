//Written by Jordan Archuleta

import java.util.Scanner;

public class Lab2 {

	public static void main(String[] args) {
		System.out.println("Input a number");
		Scanner keyboard = new Scanner(System.in);
		
		if (keyboard.hasNextInt()) {
			int number = keyboard.nextInt();
			
			if(number > 1) {					//problem
				int i = 0;							
				while(i < number) {				//solution 
					int j = 0;
					while(j <= i){
						System.out.print("*");
						j++; 
					} 
					System.out.println();
					i++;
				}

				i--;

				while(i > 0) {
					int j = 0;
					while(j < i){
						System.out.print("*");
						j++; 
					} 
					System.out.println();
					i--;
				}
			}else {
				System.out.println("number must be greater than 1");
			}
		} else {
			System.out.println("Not a number");
		}
	}

}
