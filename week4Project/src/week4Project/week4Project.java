package week4Project;

public class week4Project {
	
	//Question 1 //
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
	//Question 3//
	public static int con(String word, int n) {
		return word.length() * n;
	}
	//Question 5//
	public static boolean numbers(int[] numbers) {
		int sum = 0;
		if(int i = 0 , i < numbers.length; i++){
			sum += numbers[i];
		}
		if(sum == 100) {
			return true;
		} else {
			return false;
		}
	}
	//Question 6//
	public static double average(double[] array) {
		double sum = 0;
		for (double number : array) {
			sum += number;
		}
		return sum / array.length;
	}
	//Question 7//
	public static boolean average2(double[] array, double[] array2) {
		double sum = 0;
		double sum2 = 0;
		for (double number : array) {
			sum += number;
		}
		for(double number2 : array2) {
			sum2 += number2;
		}
		if(sum < sum2) {
			return true;
		} else {
			return false;
		}
	}
	//Question 4//	
	public static String main2(String firstName, String lastName) {
		
		String fullName = firstName + lastName;
		return fullName;
	}
	//Question 8//
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInTheBank) {
	
		
		return isHotOutside = true && moneyInTheBank >= 10.50;
		
	}
	//Question 9//
	public static void myChoice() {
		
	}
}