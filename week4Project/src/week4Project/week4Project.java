package week4Project;

public class week4Project {
	/*Question 1 */
	public static void main(String[] args) {
	int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
	int[] ages2 = new int[9];
	int sum = 0;
	for(int i = 0; i < ages.length; i++) {
		 ages2[i] = ages[i];
		if(i == 7) {
			System.out.println(ages[0] - ages[i]);
			System.out.println(ages2[0] - ages2[i]);
			sum = ages[i] + ages2[i];
		}
	 }
		System.out.println(sum);
	}
	
	//Question2//
	public static int main1(String[] args) {
		
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		int average = 0;
		for(int i = 0; i <= names.length; i++) {
			System.out.println(names[i]);
			average += names[i].length();
		}
		return average / names.length;
	}
	//Question 10//
	public static void main3(String[] args) {
		
	}
	//Question 11//	
	public static String main2(String firstName, String lastName) {
		
		String fullName = firstName + lastName;
		return fullName;
	}
	//Question 12//
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInTheBank) {
	
		
		return isHotOutside = true && moneyInTheBank >= 10.50;
		
	}
}