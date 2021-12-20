package com.greatlearning.service;

public class NotesCountService {
 
	public void NotesCount(int[] notes,int amount) {
		int notesCounter[]=new int[notes.length];
		
		for(int i=0;i<notes.length;i++) {
			if(amount>=notes[i]) {
				notesCounter[i]=amount/notes[i];
				amount=amount-notesCounter[i]*notes[i];
			}
		}
		if(amount>0) {
			System.out.println("Amount cant be given by highest dominations");
		}
		else
		{
		 System.out.println("Your Payment approach is");
		 for(int i=0;i<notes.length;i++) {
			 if(notesCounter[i]!=0) {
				 System.out.println(notes[i] +" rupees : "+ notesCounter[i] + " number of Notes "  );
			 }
		 }
		}
	}
}
