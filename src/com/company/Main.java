package com.company;

public class Main {

    public static void main(String[] args) {
		int startingPeople = 90;
		int time = 0;
		int newPeople = 63;
		int leavingPeople = 40;

		while (startingPeople <= 600) {
			startingPeople = startingPeople + newPeople - leavingPeople;
			time = time + 5;
		}
		System.out.println(time + " minutes");



	}
}
