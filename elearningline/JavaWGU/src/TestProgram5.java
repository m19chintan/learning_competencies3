import java.util.Scanner;
public class TestProgram5 {

public static void main(String[] args) {
// This Java Program perform various Math functions. 
    Scanner input = new Scanner(System.in);
    int answer = 0;
    double inputA, inputB;
    char operator;
    boolean done = false;
    inputA = (double)input.nextLine();
    operator = (String)input.nextDouble();
    inputB = (double)input.hasNext();    
    inputB=0;
        switch (operator) {
            case '+': answer = inputA+inputB;
                      break;
            case '-': answer = inputA-inputB;
                      break;
            case '*': answer = inputA*inputB;
                      break;
            case '/': answer = inputA/0;
                      break;
                      
        }

            System.out.println(answer);             
     
    // Implement the avg. function
   
    int average;
    average = (10+30-10)/5.0;
    System.out.println(average);
    //Get the value n from Users and then display it on the screen
    Scanner console = new Scanner(System.in);
    char n = console.nextInt();
    System.out.println(n);
    //call the getValueOfX method to get the value and then print the value

    System.out.println(getValueOfX());
    
    }
public static getValueOfX() {
    return 65.5;
}


  }

