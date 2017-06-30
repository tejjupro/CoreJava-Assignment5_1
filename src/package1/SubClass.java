package package1;       //This java file is inside package named package1 inside src folder.

public class SubClass extends AbstractClass   //Declaring class which is a sub class of abstract class.
{
	int firstInput,secondInput;      //Declaring two int variables.
	
	public SubClass(int firstInput,int secondInput)    //Constructor accepting two parameters.
	{
		this.firstInput=firstInput;          //Assigning the values of variables of class.
		this.secondInput=secondInput;
	}
	
	public int additionMethod()
	{
		return firstInput+secondInput;         //Adding two numbers and returning the sum.
	}
	
	public void displayContent()
	{
		System.out.println("The Sum of "+firstInput+" and "+secondInput+" is "+additionMethod());      //Printing the sum.
	}
}     //End of class.