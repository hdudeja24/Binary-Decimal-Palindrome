import java.util.Scanner;

public class Project1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input Range > ");

		String input = sc.nextLine();
		int [] range = FilterInput(input);

		boolean isValidInput = ValidInput(range);

		if (isValidInput){
			// We get here if the user's input is valid
		}
		
	}

	private static int [] FilterInput(String line){
		/**
		 * This function takes a string and splits it into an int array equivalent to the first two values in the line
		 **/

		int[] range = new int[2];							// This will be the array we will return
		String nums[] = line.split(" ");				// Splitting the String into array

		 for(int i = 0; i < range.length; i++)				// Loop to insert values into range
		 	range[i] = Integer.parseInt(nums[i]);			// Inserting int value of String array

		 return range;										// Return array
	}

	private static boolean ValidInput(int nums[]){
		/**
		 * This function checks the two conditions for our input to be valid.
		 * returns false if  any values is less than or equal to 0
		 * returns false if first number is larger than the second
		 * else returns true
		 **/

		// To check if any values is less than or equal to 0
		if(nums[0] <= 0 || nums[1] <= 0){
			System.out.println("Error: Invalid value entered. All values must be greater than zero. Try Again.");
			return false;
		}
		// To check if the first number is larger than the second
		if(nums[0]  > nums[1] ){
			System.out.println("Error: First number is larger than second number. Try Again.");
			return false;
		}
		return true;
	}

}
