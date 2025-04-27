package week4Project;


public class week4Project {
	
	//Question 1 //
	public static void main(String[] args) {
	int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
	int[] ages2 ={3, 9, 23, 64, 2, 8, 28, 93, 100};
			System.out.println(ages[ages.length - 1] - ages[0]);
			System.out.println(ages2[ages2.length - 1] - ages2[0]);
		double sum = 0;
			for (double number : ages) {
				sum += number;
			}
			System.out.println(sum / ages.length);
	//Question2//
		
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		double average = 0;
		for(int i = 0; i < names.length; i++) {
			average += names[i].length();
		}
		System.out.println(average / names.length);
		String fullWord = "";
		for(int i = 0; i < names.length; i++) {
			fullWord += names[i] + " ";
		}
		int sum1 = 0;
		for(int i = 0; i < names.length; i++) {
			sum1 += names[i].length();
		}
		int[] array = {5, 25, 15, 13, 42};
		double[] arr = {10.5, 11, 15.9, 17.88, 88.9};
		double [] arr2 = {38.9, 7.6, 12.5, 9.1, 33.6};
		System.out.println(sum1);
		System.out.println(fullWord);
		System.out.println(con("Hello", 5));
		System.out.println(fullName("Alex", "Cerveny"));
		System.out.println(willBuyDrink(true, 10.50));
		System.out.println(myChoice(5, "Shih-tzu"));
		System.out.println(numbers(array));
		System.out.println(average(arr));
		System.out.println(average2(arr, arr2));
	}//end of main//
	//Question 3//
	public static String con(String word, int n) {
		String fullWord = "";
		for(int i = 0; i < n; i++) {
			fullWord += word;
		}
		return fullWord;
	}
	//Question 5//
	public static boolean numbers(int[] num) {
		int sum = 0;
		for(int i = 0; i < num.length; i++){
			sum += num[i];
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
		if(sum / array.length > sum2 / array2.length) {
			return true;
		} else {
			return false;
		}
	}
	//Question 4//	
		public static String fullName(String firstName, String lastName) {
		return firstName + " "  +lastName;
		}
	//Question 8//
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInTheBank) {
	
		
		return isHotOutside && moneyInTheBank >= 10.50;
		
	}
	//Question 9: i chose this problem as a way remember my families pets through the years//
	public static boolean myChoice(int number, String dogBreed) {
		
		return(number == 5 && dogBreed == "Shih-tzu" || dogBreed == "Golden Retriever" || dogBreed == "Rat Terrior" || dogBreed == "Schnauzer");
	}
}//end of class//