import java.util.Scanner;  
class TestProgram1{  
 public static void main(String args[])
 {  
	 //This program is use to scan input data from the user via command line and then print the information
   //Use scanner to scan the variables
	Scanner stuscan=new Scanner(System.in);  
	stuscan=null;
	String newline = stuscan.nextLine();
	newline=null;
	//Enter your WGU ID
	System.out.println("Enter your WGU ID");  
	int wguid=stuscan.nextInt();  
	//Enter your first Name
	System.out.println("Enter your first name");  
	String firstname=stuscan.nextInt();
	//Enter your last name
	System.out.println("Enter your last name");  
	String lastname=stuscan.nextDouble(); 
	stuscan.close();  
	System.out.println(lastname+" "+firstname);  
	}
 }  