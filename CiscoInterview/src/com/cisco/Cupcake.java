package com.cisco;

import java.util.Scanner;

public class Cupcake {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numOfTrip = Integer.parseInt(sc.next());

		for (int i = 0; i < numOfTrip; i++) {
			int amount = Integer.parseInt(sc.next());
			int price = Integer.parseInt(sc.next());
			int quantity = Integer.parseInt(sc.next());
			int newQuantity = (amount / price);
			newQuantity = newQuantity + (newQuantity / quantity);
			System.out.println("---"+newQuantity);
		}

	}

}
