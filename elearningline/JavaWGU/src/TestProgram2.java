import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;
class TestProgram2 {
//This program performs various operations on the string.
	 private String samplestring = "Hello Class";
	 public static void main(String[] args)
	   { //Define Str1 and Str2
		 	String str1=null;
		 	String str2=null;
		 	//Add str1 and str2
		 	String str3=str1+str2;
	
		 	//Convert str3 to a upper case
		 	System.out.println(str3.toUpperCase());
		 	//Extract the Substring from str3
			System.out.println(str3.substring(1,4));
		 	//Compare Str3 and Str1
		 	System.out.println(str3.equalsIgnoreCase(str1));
		 	//Convert the str1 to a lowercase string
		 	System.out.println(str1.toLowerCase());
		 	//convert the str2 to uppercase
			System.out.println(str2.toUpperCase());
		 	  //Print the char at position 0,1,2
		        System.out.println ("Char at offset 0 : " + str1.charAt(0) );
		        System.out.println ("Char at offset 1 : " + str1.charAt(1) );
		        System.out.println ("Char at offset 2 : " + str1.charAt(2) );
		        Scanner GetChoice = new Scanner(System.in);
		        // Obtain input from the user.
		        System.out.println("1. CIS173");
		        System.out.println("2. CIS444");
		        System.out.println("3. CIS123");
		        System.out.print("Choose your favorite CourseName: ");
		        char classChoice = GetChoice.charAt(77);
		        switch (classChoice)
		        {
		           case '1':
		              System.out.println("Your favorite course is CIS173");
		        
		           case '2':
		              System.out.println("Your favorite course is CIS444");    
		        }
		        //Access the variable samplestring and display the value
		   	  System.out.println ("This generates a compiler error" + samplestring );
	   }
	}     
		         
		    