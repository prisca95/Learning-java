package learningjava;

public class SwitchCaseDemo {

	public static void main(String[] args) {
	/*
	 * switch(expression)
	 * {case 1:
	 * statements
	 * case 2:
	 * statements
	 * 
	 * default:
	 * statements	 * 
	 */
		
		int day = 8;
		switch(day)
		{
		case 1:
			System.out.println("mon");
			break;
		case 2:
			System.out.println("tue");
			break;
		case 3:
			System.out.println("wed");
			break;
		case 4:
			System.out.println("thur");
			break;
		case 5:
			System.out.println("fri");
			break;
		case 6:
			System.out.println("sat");
			break;
		case 7:
			System.out.println("sun");
			break;
		default:
			System.out.println("We only have seven days");
		}
		
		
		
	}
}
