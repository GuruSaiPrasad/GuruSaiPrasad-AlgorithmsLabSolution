package com.greatLearning.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter size of the transaction array ");
		int trans=scan.nextInt();
		System.out.println("Enter the transaction array values");
		int numberoftrans[]=new int[trans];
		for(int i=0;i<trans;i++) {
			numberoftrans[i]=scan.nextInt();
		}
		System.out.println(" Enter the total no of targets that needs to be achieved  ");
		int targetnumber=scan.nextInt();
		while(targetnumber!=0) {
			int flag=0;
			System.out.println("Enter the value of target");
			int target=scan.nextInt();
			int sum=0;
		
			for(int i=0;i<trans;i++)
			{
				sum=sum+numberoftrans[i];
				if(sum>=target) {
					flag=1;
					System.out.println("Target achieved after "+(i+1)+ " Transaction done");
					break;
				}
				
			}
			
			if(flag==0)
			{
				System.out.println("Target did not achieve");
			}
			targetnumber--;
			
		}
	}

}
