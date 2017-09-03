package data;
//package defines a name space in which classes are stored
public class Datamember
//public keyword is used in the declaration of a class,method or field;public classes,method and fields can be accessed by the members of any class.
//class defines instance and class fields,methods and inner classes as well as specifying the interfaces the class implements and the immediate superclass of the class
{

	public static void main(String[] args){
	//Java Program processing starts from the main() method which is a mandatory part of every program 		
	//static used to prepare a field,method or inner classes as a class field.
	//void is used to define the return type of the method
	//String[] args is actually an array of java.lang.String type and it's name is args here
	//String is predefined class name 
	//args is name of the array{
		// TODO Auto-generated method stub
		int var=1;//var is equal to 1 and initialize to integer data type
		//variable we are trying to change from second class
		Second second=new Second();
		//Second is name of the class
				//second is a reference variable
				//new is operator that which allocates memory to an object
				//Second is constructor call
		System.out.println(var);
		var=Second.test(var);//prints out 1
		System.out.println(var);
		//prints again 1 even though we changed it
		//creating an object and adding the value to it.printing the value and calls the class
	}

}
class Second
{
 static int test(int var)
	//means that the variable or function is shared between all instances of that class
 //as it belongs to the type
	{
		var=2;
		//we try to change to 2 and it works in this class but when it doesn't change in the
		// class "data member"
		System.out.println(var);//prints out 2
		return var;
	}
}