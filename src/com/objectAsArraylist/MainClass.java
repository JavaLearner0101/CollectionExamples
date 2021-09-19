package com.objectAsArraylist;

import java.util.Scanner;

public class MainClass {

	
	public static void main (String [] args) {
		String option = null;
		Scanner sc = new Scanner(System.in);
		MainClass mainclass = new MainClass();
		ArrayListObject als = new ArrayListObject();
			
		do {
			mainclass.menu();
			option = sc.nextLine();
			mainclass.switchAction(als, option);
			System.out.println("--------------------------------------------------------------------x-----------------------------------------");
			System.out.println("");
		}while(!option.equals("6"));
		sc.close();
	}

	private void switchAction(ArrayListObject als, String option) {
		switch(option) {
		case "1":
			als.add();
			break;
		case "2":
			als.update();
			break;
		case "3":	
			als.delete();
			break;
		case "4":	
			als.find();
			break;
		case "5":	
			als.displayAll();
			break;
		case "6":	
			break;

		default :
			System.out.println("Not a valid input, please try again");
			break;
		}
		
		
	}

	private void menu() {
		System.out.println("1 : Add a mobile number");
		System.out.println("2 : Update a mobile number");
		System.out.println("3 : Delete a mobile number");
		System.out.println("4 : Find a mobile number");
		System.out.println("5 : Display all students");
		System.out.println("6 : Exit");
		

	}
	
	
	
	
}
