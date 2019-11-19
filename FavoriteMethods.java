/*
	Jamie Steck and CSIS 293 FA19 0939
	Nov 13, 2019
	FavoriteMethods.java
	A collection of our favorite useful (static) methods
	Dependencies: none
	Credit: none
*/

import java.util.Random;

public class FavoriteMethods
{
	public static void main(String[] parameters)
	{
		//the purpose of this program is to create a collection of useful (static) methods
		//methods that could be used in many different programs
		//methods that could be useful for future projects!
		//each person can add in a method that they think is useful
		//it can be something new or something we've done in the past
		//so write the method and then test it out
		
		//here is Prof Steck's:
		System.out.println("Prof Steck:  Generate a random number in range...");
		System.out.println(randomNumber(2,10));
		
		//here is Pat Sullivan's:
		System.out.println("Pat Sullivan: Simulating a d20 dice...");
		d20();
		
		//here is Ben Berk's
		System.out.println("Ben Berk: Calculating area of the circle...");
		circleArea(4);
		
		//here is Joseph LeVine's
		System.out.println("Joseph LeVine: Sorting the following list...");
		bubbleSort();

	}//end main method

	//randomNumber() returns a random number in the given range (between low and high, inclusive)
	public static int randomNumber(int low, int high)
	{
		Random ranGen = new Random();
		int ranNum = ranGen.nextInt(high-low+1) + low;
		return ranNum;
	}
	
	//d20 method, uses the randomNumber method to simulate a 20 sided dice
	public static void d20()
	{
		int roll = randomNumber(1,20);
		System.out.printf("User has rolled a %d!%n", roll);
		if(roll == 1)
		{
			System.out.println("Critical Fail!");
		}
		else if(roll == 20)
		{
			System.out.println("Critical Success!");
		}
	}
	
	public static int returnTheNumberofEvenIntInArray(int[] array)
	{
		int a = 0; // varaible to hold the number of even integer
		for(int i = 0; i < array.length; i++)
		{
			if(i%2 == 0) // check if the number at index i in the array is even
			{
				a++;// increase the value
			}
		}
		return a;
	}
  
  	//Calculates the are of circle
	public static void circleArea(int radius)
	{
		double dArea = Math.PI * Math.pow(radius, 2);
		int area = (int)dArea;
		System.out.println("The area of the circle " + area);
  	}
	
	public static void printStringArray(String[] array)
	{
		for(int i =0; i < array.length; ++i)
		{
			System.out.printf("%s, ", array[i]); 
		}
		System.out.println();
  	}

	//sum of an arrays of numbers
	public static int sumOfAnArray(int[] numbers)
	{
		int sum = 0; //sum
		for(int i = 0; i < numbers.length; i++) //going through loop
		{
			sum = sum + numbers[i]; //calculating sum
		}
		return sum; //returning sum
	}

	//Loop a word.
	public static void loopAWord (String [] args) 
	{ 
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter one word and num: ");
		String word = input.next();
		int num = input.nextInt();
		
		int count = 1;
		while(count <= num )
		{
			System.out.printf("%s ", word);	
			count ++;
		}
	}
		
	private static void printArray(int[] printArray) {
		for (int index = 0; index < printArray.length; index++) {
		    System.out.println(printArray[index]);
		}
	}
		
	private static void bubbleSort() //sorts an array of numbers
	{
		int[] nums = new int[10];
		Random randGen = new Random();
		
		for(int i = 0; i<nums.length; i++){
			nums[i] = randGen.nextInt(10)+1;
		}
		
		//print the unsorted array
		System.out.print("\n[ ");
		for(int i = 0; i<nums.length;i++){
			System.out.print(nums[i] + " ");
		}
		System.out.print("]");
		
		boolean sorted = false; //control variable for the sorting
		do{
			sorted = true; //set the flag to true
			
			for(int i = 0; i<nums.length; i++){
				if(nums[i] > nums[i+1]){
					sorted = false; //if two numbers needed to be swapped, the list is not sorted.
					int temp = nums[i+1]; //temp value so the two can be swapped
					nums[i+1] = nums[i];
					nums[i] = temp;
				}
			}
		}while(sorted==false);
		
		//print the sorted array
		System.out.print("\n[ ");
		for(int i = 0; i<nums.length;i++){
			System.out.print(nums[i] + " ");
		}
		System.out.print("]");
		
		// Java Program to Count Odd Numbers in an Array using For Loop
import java.util.Scanner;
public class CountOdd1 {
	private static Scanner sc;
	public static void main(String[] args) 
	{
		int Size, i, oddCount = 0;
		sc = new Scanner(System.in);

		System.out.print(" Please Enter Number of elements in an array : ");
		Size = sc.nextInt();	

		int [] a = new int[Size];

		System.out.print(" Please Enter " + Size + " elements of an Array  : ");
		for (i = 0; i < Size; i++)
		{
			a[i] = sc.nextInt();
		}   
		System.out.print("\n List of Odd Numbers in this Array are :");
		for(i = 0; i < Size; i++)
		{
			if(a[i] % 2 != 0)
			{
				System.out.print(a[i] + " ");
				oddCount++;
			}
		}
		System.out.println("\n Total Number of Odd Numbers in this Array = " + oddCount);
	}//end bubbleSort
}//end class
