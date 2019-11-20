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

		//here is Noah Eichler's
		System.out.println("Calculating the factorial of 5.");
		factorial(5);

		//here is Keith Askew's:
        	System.out.println("Keith Askew's Printing Backwards Arrays");
        	int[] arrayToPrint = new int[] {1, 2, 3, 4, 5}; //Can change numbers to whatever you like or add more
        	printArrayBackward(arrayToPrint);

		//here is Jackson Zavodny's
		System.out.println("Jackson Zavodny: Getting a fortune...");
		fortuneCookie();

		//here is Sasha's
		int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 01};
		printArrayBackward2(nums);
		
		//here is Henry Tran's:
		System.out.println("Henry Tran: Calculating area of the square...");
		squareArea(12);
		
		//from Nhi
		int ranNum = randomNumber(2,10);
		System.out.println(ranNum);
		//is it an even number?
		 System.out.println("Is it an even number? " + isEvenNumber(ranNum));
		
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
	
	//Calculates the factorial of a given number.
	public static int factorial(int number) 
    	{ 
		if (number == 0) 
		{
			return 1; 
		}
		return number*factorial(number-1); 
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
	}//end bubbleSort
	
	//this method prints any array of ints backwards
        private static void printArrayBackward(int[] arrayOfNumbers)
    	{
	    for (int i = arrayOfNumbers.length - 1; i >= 0; i--)
	    {
	    System.out.print(arrayOfNumbers[i] + " ");
	    }
    	}
	


	//max(int, int, int) find the maximum between three integers
	private static int max(int x, int y, int z)
	{
		int maxValue = x;
		
		if (y > maxValue)
		{
			maxValue = y;
		}
		
		if (z > maxValue)
		{
			maxValue = z;
		}
		
		return maxValue;
	} //end of max of three integers

	//Printing an Int array backward
	public static void printArrayBackward2(int[] arrayToPrint)
	{
		for (int i = arrayToPrint.length - 1; i >= 0; i--)
             	{
          	     System.out.printf("%s, ", arrayToPrint[i]);
       		}
        	System.out.println();
    	}//end of printingArrayBackward
	public static void fortuneCookie() //Gives a fortune based on randomly generated number
        {
            //generates a random number between 1-10.
            Random randomGen = new Random();
            int randomNum = randomGen.nextInt(10) + 1;

            //Prints out fortune cookie statements depending on the random number generated
            switch(randomNum)
            {
                case 1:
                    System.out.println("Today it's up to you to create the peacefulness you long for.");
                    break;
                case 2:
                    System.out.println("Your high-minded principles spell success.");
                    break;
                case 3:
                    System.out.println("Hard work pays off in the future, laziness pays off now.");
                    break;
                case 4:
                    System.out.println("Change can hurt, but it leads a path to something better.");
                    break;
                case 5:
                    System.out.println("A dream you have will come true.");
                    break;
                case 6:
                    System.out.println("You will become great if you believe in yourself.");
                    break;
                case 7:
                    System.out.println("You already know the answer to the questions lingering inside your head.");
                    break;
                case 8:
                    System.out.println("The greatest risk is not taking one.");
                    break;
                case 9:
                    System.out.println("Now is the time to try something new.");
                    break;
                case 10:
                    System.out.println("Its amazing how much good you can do if you don't care who gets the credit.");
                    break;
                default:
                    System.out.println("Error, your fortune cookie created a paradox and was subsequently deleted from existence.");
            }
		
		//calculate the area of square
	public static void squareArea(int edge)
	{
		double sArea = Math.pow(edge, 2);
		System.out.printf("Calculate the area of square %.0f", sArea);
	}

        }//end fortune cookie
	
	//Nhi adds: isEvenNumber() method to check if the random number is an even number 
	public static boolean isEvenNumber(int ran){
		boolean found;
		if(ran % 2 == 0){
		    found = true;
		}
		else{
		    found = false;
		}
		return found;
   	}

}//end class
