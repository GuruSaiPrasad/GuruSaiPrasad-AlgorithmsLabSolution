package com.greatlearning.Main;

import java.util.Scanner;

import com.greatlearning.service.BubbleSortImplementation;
import com.greatlearning.service.NotesCountService;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the Number of Currency Denominations");
		int numberOfCurrency=scan.nextInt();
		System.out.println("Enter the Value one by one");
		int[] currencies=new int[numberOfCurrency];
		for(int i=0;i<numberOfCurrency;i++) {
			currencies[i]=scan.nextInt();
		}
		BubbleSortImplementation bubbleSortImplementation=new BubbleSortImplementation();
		bubbleSortImplementation.BubbleSortImaplementation(currencies);
		
		
		NotesCountService notesCountService=new NotesCountService();
		System.out.println("Enter the amount to pay=");
		int amount=scan.nextInt();
		notesCountService.NotesCount(currencies,amount);
	}

}
