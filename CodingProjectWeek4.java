package codingproject;

import java.util.Arrays;

public class CodingProjectWeek4 {
	public static void main(String[] args) {
	
//1:		
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
	//a	
		int lastElement = (ages[ages.length-1]);
		System.out.println("Last element minus first element: " + ((lastElement)-(ages[0])));
		
		int sum1 = 0;
		int length1 =ages.length;
	//c		
		for(int i=0; i<ages.length; i++) {
			sum1+=ages[i];
		}
		double average = (sum1/length1);
		System.out.println("Average Age: " + average);
	//b		
		int[] fibonnaciSequence = {0,1,1,2,3,5,8,13,21};
		int lastNumberInSequence = fibonnaciSequence[fibonnaciSequence.length-1];
		System.out.println("My array, last minus first: " + (lastNumberInSequence-(fibonnaciSequence[0])));

//2		
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
	//a
		double sum2 = 0;
		double length2 = names.length;
		
		for(int i=0; i<names.length; i++) {
			sum2 = sum2+names[i].length();	
		}
		double average2=(sum2/length2);
		System.out.println("Average number of letters: " + average2);
	//b	
		String space = "";
		for(int i=0;i<names.length;i++) {
			space+=names[i] + " ";
		}System.out.println(space);
		
//3: Accessing the last element in an array: nameOfArray[nameOfArray.length-1] 
//4: The first element is always 0, so nameOfArray[0] would retrieve that element.
//5:		
		int[] nameLengths = new int[names.length]; 
		
		for (int i=0; i<names.length; i++) {
			 nameLengths[i]=names[i].length();		
			}System.out.println(Arrays.toString(nameLengths));
//6
		int sum6 = 0;
		for (int i=0; i<names.length; i++) {
				sum6+=nameLengths[i];
			}System.out.println(sum6);
//7
	String greeting = "hello";
	System.out.println(repeatingWord(greeting, 3));
			
//8
	String firstName = "Sarah";
	String lastName = "Haggerty";
	System.out.println("Full name: " + concatNames(firstName, lastName));
//9
	int[] array9 = {6,10,17,19,20,4,5,9,13,18,21,23,3,7};
	System.out.println("Is the sum greater than 100: " + sumArray(array9));
//10
	double[] array10 = {1.12,2.22,3.33,4.45,5.51,6.62,7.73,8.84};
	System.out.println("Average of array: " + averageOfArray(array10));
//11
	double[] array11 = {1.11,1.23,3.42,4.32,5.42,6.53,7.64,8.53};
	System.out.println("Is the first array average greater: " + isAverageGreater(array10, array11));
//12
	boolean isHotOutside = true;
	double MoneyInPocket = 12.68;
	System.out.println("WillBuyDrink: " + willBuyDrink(isHotOutside,MoneyInPocket));
//13 I created this method to double check if a rental hall 
//would hold the guest list for a party
	int seatsPerTable = 8;
	int numOfTables = 12;
	int guestList = 100;
	System.out.println("Will there be enough room: " + willTheRoomBeBigEnough(seatsPerTable,numOfTables,guestList));

		
	}//end of main line
//7
	public static String repeatingWord(String str, int x) {
		if (x>0) {
		return str.repeat(x);
	} else { 
		return str;
	}
	}
	
	//8
	public static String concatNames(String firstName, String lastName) {
		return firstName.concat( " " + lastName);
	}
//9
	public static boolean sumArray(int[] array9) {
	int sum9 = 0;
		for(int i=0; i<array9.length; i++) {
			sum9+=array9[i];
		} if (sum9>100) {
			return true;
		}else {
			return false;
		}
	}
//10
	public static double averageOfArray(double[] array10) {
		double length10 = array10.length;
		double sum10 = 0;
		for(int i=0; i<array10.length; i++) {
			sum10+=array10[i];
	}return sum10/length10;
	}
//11
	public static boolean isAverageGreater(double[] array10, double[] array11) {
		double length10a = array10.length;
		double length11 = array11.length;
		double sum10a = 0;
		double sum11 = 0;
		for(int i=0; i<array10.length; i++) {
			sum10a+=array10[i];
		}
		for(int i=0; i<array10.length; i++) {
			sum11+=array11[i];
		}
		if ((sum10a/length10a)>(sum11/length11)){
			return true;
		}else {return false;}
		
			
	}
//12
	public static boolean willBuyDrink(boolean x, double y) {
		if ((x=true) && (y>10.50)){
			return true;
		}else {
			return false;
		}
	}
//13 
	public static boolean willTheRoomBeBigEnough(int tables, int seats, int guests) {
		if ((tables * seats) > guests) {
			return true; 
		}else {
			return false;
		}
	}
	
	
}//end
