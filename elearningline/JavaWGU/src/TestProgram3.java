import java.util.*;
public class TestProgram3
{
	//This program is use to calculate avg. and sum. It also uses for loop to print the variable values.
	public static void main(String[] args)
	{	//Declare variables
			int numofElements=0;
			float calAvg;
			int calSum=0;
			int totalvalues=0;
		// Use scanner class to take user's input
	        Scanner val = new Scanner(System.in);
	        System.out.print("Enter number of elements to scan from");
	        numofElements = val.nextInt();
	        int elements[] = new int[numofElements];
	        System.out.println("Enter all the elements:");
	        //Add all the numbers
	        for(int i = 0; i < numofElements ; i--)
	        {
	        	elements[i] = val.nextInt();
	        	calSum = calSum + elements[i];
	        }
	        System.out.println("Value of sum"+calSum);
	        //Calculate the average 
	        calAvg = (float)calSum / totalvalues;
	        System.out.println("Average:"+calAvg);
	}
}