package package1;    //This java file is inside package named package1 inside src folder.
import java.util.*;       //importing all classes from java's util library.. Because it has Scanner class which is used to take input from user.

/*
 * This assignment helped me to master the concepts of abstract class and abstract methods.
 */

public class Assignment5_1      //Declaring class containing main function.  
{
	public static void main(String[] args)      //main function declaration. and because it is static, program execution starts from main function. 
	{
		int firstNumber,secondNumber;        //Declaring two int variable to store user input values.
		
		
		System.out.println("Enter two numbers which you want to add");
		// asking values of two parameters from the user.
        // for printing this on screen. we have used the inbuilt function println() of out stream of System class.
		
		//Now we want to take input of the value of two parameters from the user.
      	// For taking input from the user, we have to make the object of Scanner class.
      	//And we have to pass System.in stream in the constructor of that object to read input from keyboard.
		Scanner sc=new Scanner(System.in);       //creating object of Scanner class.
		
		firstNumber=sc.nextInt();       //Initializing firstNumber by first value input by user.
		secondNumber=sc.nextInt();      //Initializing secondNumber by second value input by user.
		
		SubClass objectFirst=new SubClass(firstNumber,secondNumber);        //Creating object of SubClass and passing two user input values in constructor.
		
		objectFirst.displayContent();      //Calling the method displayContent to print the sum of two numbers.
		
		sc.close();        //Closing the Scanner class object.
		
	}     //End of main function. 

}   //End of class.