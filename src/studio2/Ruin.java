package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		double startAmount;
		double winChance;
		double winLimit;
	
		Scanner in = new Scanner(System.in);
			System.out.println("What amount do you want to start with?");
				startAmount = in.nextDouble();
				
			System.out.println("What is your win chance?");
				winChance = in.nextDouble();

			System.out.println("What is your win limit?");
				winLimit = in.nextDouble();
				
			while (startAmount < winLimit && startAmount > 0) {
				if (Math.random() <= winChance) {
					startAmount--;
				}
				else {
					startAmount++;
					}	
				}
				if (startAmount<=0) {
					System.out.print("You lose");
				}
				else {
					System.out.print("You win");
				}
		}


	}


