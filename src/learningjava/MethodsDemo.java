package learningjava;

public class MethodsDemo {

	public static void main(String[] args) {
//video 18 & 19
		//to use static methods, objects has to be created
		MethodsDemo md = new MethodsDemo();
		md.doLogin();
		md.doLogout();

		System.out.println(md.addNumbers(5,10));
		
		md.diffParameters("This is string", 7, 14);
	}

	public void doLogin() 
	{// start

		System.out.println("Login successful");
		
	}// end

	public void doLogout()
	{
		doLogin();
		System.out.println("logout successful");
	}

	public int addNumbers(int x, int y)
	{
		return x+y;  //this method had to be called in the main string
	}
	
	public void diffParameters(String s, int i, float f)
	{
		System.out.println(s);
		System.out.println(i);
		System.out.println(f);
		//to print them out on console
//this is a void method because it has different parameters
	}
	//void - it returns nothing
	//int - it returns numbers
	
}
