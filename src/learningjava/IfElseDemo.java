package learningjava;

public class IfElseDemo {

	public static void main(String[] args) {
		
    int num1=40;
    int num2=20;
    int num3=30;
    
    if(num1 > num2) {
    	System.out.println("Number 1 is greater than number 2");
    	
    	if(num2 < num3)
    	{
    		System.out.println("Within nested if else");
    	}
    	
    	else
    	{
    		System.out.println("In the nested block");
    	}
    }
    
    
    else if(num1==num2)
    {
		System.out.println("Number 1 is equal to number 2");
	}
    
    else if(num1<num2)
    {
    	System.out.println("Number 1 is less than number 2");
    }
    else
    {
    	System.out.println("In the last block");
    }
    
    //video 8
}
	
}