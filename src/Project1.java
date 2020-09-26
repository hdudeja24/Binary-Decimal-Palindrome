import java.util.Scanner;

public class Project1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input Range > ");

		String input = sc.nextLine();
		int [] range = FilterInput(input);

		for (Integer num: range)
			System.out.println(num);
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

}
