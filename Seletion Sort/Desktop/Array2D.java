import java.util.Scanner;
public class Array2D
{
	public static void main(String[] args)
	{
                // Scanner Object
		Scanner input = new Scanner(System.in);

                // Taking the number of rows
		System.out.print("Enter number of rows: ");
		int rows = input.nextInt();
                
                // Taking the number of collumns
		System.out.print("Enter number of cols: ");
		int cols = input.nextInt();

		//Create a 2-d array
		int[][] matrix = new int[rows][cols];

		//Input from user ==>> Note that for 2-D array you need two loops outer loop traverse row and inner loop traverse collumn
		for(int row = 0; row < rows; ++row)
		{
			for(int col = 0; col < cols; ++col)
			{
                                // Message
				System.out.print("Enter element at matrix[" + row + "][" + col + "] : ");
                                // Taking input from user and assigning to element
				matrix[row][col] = input.nextInt();
			}
		}

		//Print whole array
		for(int row = 0; row < rows; ++row)
		{
			for(int col = 0; col < cols; ++col)
			{
                                // print element
				System.out.print(matrix[row][col] + "   ");
			}
			System.out.println();
		}

		//Calculating Sum of all elements' values
		int sum = 0;
		for(int row = 0; row < rows; ++row)
		{
			for(int col = 0; col < cols; ++col)
			{
                                // Sum
				sum = sum + matrix[row][col];	
			}
			
		}
		System.out.println("Sum of all elements of matrix = " + sum);

	}//main
}//class