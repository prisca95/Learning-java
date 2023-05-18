package learningjava;

public class SingleDimensionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int myint =2;
		int[] myIntArray = new int[10];
		 myIntArray[0] = 10;
		 myIntArray[1] = 20;
		 myIntArray[2] = 30;
		 myIntArray[3] = 40;
		 System.out.println(myIntArray[3]);
		 System.out.println(myIntArray.length);
		 
		 int[] myIntArray1 = {10, 20, 30, 40};
		 // Or in this form , but it is not a good practice
		 int myIntArray2[] = {10, 20, 30, 40, 50};
		 System.out.println(myIntArray1[1]);
		 System.out.println(myIntArray1.length);
		 
		 String[] myStringArray = new String[5];
		 
		 //Or
		 
		 //Calling out the index through a For Loop
		 int[] myIntArray3 = {10, 20, 30, 40, 50};
		
		 for(int i=0;i<myIntArray3.length;i++)
		 {
			 System.out.println(myIntArray3[i]);
		 }
		 
		 
		 
	}

}
