package miniProject;

import java.util.Scanner;

public class insertNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner value= new Scanner(System.in);
		System.out.println("Uloha 1.\nNapis hocijake cislo pre zistenie ci je parne alebo nie");
		 int insertValue=value.nextInt();
		
		
		//if n si odd print right
		if(insertValue%2==1 ) {
			System.out.println("Cislo nie je parne: " + insertValue );}
		
		else if (insertValue==0) { 
			System.out.println("Cislo je nula: " + insertValue );}
			
		else if (insertValue%2==0) { 
			System.out.println("Cislo je parne: " + insertValue );}
		
		System.out.println("Uloha 2.\nNapis hocijake cislo x, ak  2<x<10 vypise text"); 
		
		int insertValue2=value.nextInt();
		
		if (insertValue2<10 && insertValue2>2) {
			System.out.println("Cislo je medzi 2 az 10");
			
		}
		else if (insertValue2==0) {System.out.println("Napisal si nulu");}
		else { 
			System.out.println("Nenapisal si cislo medzi 2 az 10");
		}
		
		
		System.out.println("Uloha 3. \nNapis cislo x pre zistenie ci je parne a v rozmedzi 9 az 50");
		
		int insertValue3=value.nextInt();	
		if (insertValue3<50 && insertValue3>9 ) {
			if (insertValue3%2==0) { System.out.println("Toto cislo je parne a je: " + insertValue3);	
			}
			
		}
		if (insertValue3<50 && insertValue3>9 )  {
		if (insertValue3%2==1){System.out.println("Cislo " + insertValue3 + " nie je parne");}
		}
		else if (insertValue3==0) {System.out.println("Napial si nulu");}
		else  {System.out.println("Napisal si ine cislo ako dane rozmedzie");}
		

	}

}
