package learningjava;

public class OperatorsinJava {
	
public static void main(String[] args) {
	
	int mynumber = 15;
	String str = "String demo";
	
	int number1 = 10;
	int number2 = 20;
	number1++;
	number1--;
	
	boolean bool = !true;
	
	if(number1>=number2)
	{
		System.out.println("numbers are equal");
	}
	else
	{
		System.out.println("numbers are not equal");
	}
	
	
	System.out.println(bool);
	System.out.println(number1+number2);
	System.out.println(number1+str);
	
	System.out.println(number2/number1);

	if((number1 == 10) && (number2 == 20));
	{
		System.out.println("This is conditional operator");
	}
  }
}
