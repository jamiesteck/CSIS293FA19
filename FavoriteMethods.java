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
		int a = 0// varaible to hold the number of even integer
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
  	}//prints an array of ints
	 private static void printArray(int[] printArray) {


        for (int index = 0; index < printArray.length; index++) {
            System.out.println(printArray[index]);
        }
    }

}//end class
