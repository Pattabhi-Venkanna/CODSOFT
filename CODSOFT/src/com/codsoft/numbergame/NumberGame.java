package com.codsoft.numbergame;

import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {
		
		int numberofAttempts=5;
		int attempts;
		System.out.println("Guess the number between 1 to 100");
		Scanner sc= new Scanner(System.in);
		int score = 0;
		String decision;
		do {
			System.out.println("you have only 5 attempts");
			for(attempts=1; attempts<=numberofAttempts;attempts++) {
				score=0;
				int random=(int)(Math.random()*100+1);
				System.out.println("enter the number attempt-"+attempts+":");
				int guess =sc.nextInt();
				if(guess==random) {
					System.out.println("you have enterd correct number "+random);
					score++;
					}
				else if(guess>random) {
					System.out.println("you have enterd high number i.e "+guess+ " corect number is "+random);
					}
				else {
					System.out.println("you have enterd low number i.e "+guess+ " corect number is "+random);
					}
			}
			System.out.println("your score: "+score);
			System.out.println("do you want to play game again  enter yes/no");
			decision= sc.next().toUpperCase();
		} while (decision.equals("YES"));

		System.out.println("Game Over ");

	}

}
