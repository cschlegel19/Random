import java.util.Scanner;

public class Practice {

	public static void main(String[] args) 
	{
		///printing
		System.out.println("I know how to print.");
		
		
		///printing the value of a variable
		int integer; ///declared
		integer = 20; ///initialization ---> the first assignment statement
		
		double decimal = 20.234; ///declared and initialized in one line 
		
		String str = "Hello world!"; ///declared and initialized in one
		
		
		///printing values
		System.out.println(integer);
		System.out.println(decimal);
		System.out.println(str);
	
		
		///add 30 to integer
		///subtract 25 from decimal
		///concatinate "more stuff" to str
		integer += 30;
		decimal = decimal - 25.023452;
		str = str + " more stuff";
		
		
		///now print
		System.out.println("integer: " + integer);
		System.out.println("decimal: " + decimal);
		System.out.println("str:  " + str);
		
		
		///input info from the user
		Scanner yee = new Scanner(System.in);
		
		///create a new string variable.  Prompt the user to enter favorite sport.
		///print "you're favorite sport is ___ and mine is____.
		System.out.println("What is your favorite sport?");
		String theirSport = yee.nextLine();
		String myfavSport = "Baseball";
		
		System.out.print("Your favorite sport is " + theirSport + ", and mine is" + myfavSport + ".");
		
		
		
		
		
	}
	
	

}
