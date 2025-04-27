package week4Project;


public class week4Project {
	
	//Question 1 // this section of code takes the two int arrays(ages and ages2) and gives the difference between the first and the last numbers in the arrays and averages the ages put into the array
	public static void main(String[] args) {
	int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
	int[] ages2 ={3, 9, 23, 64, 2, 8, 28, 93, 100};
			System.out.println(ages[ages.length - 1] - ages[0]);
			System.out.println(ages2[ages2.length - 1] - ages2[0]);
		double sum = 0;
			for (double number : ages) {
				sum += number;
			}
			System.out.println(sum / ages.length); // Question 1 output//
	//Question2//This section of code takes a string array, and outputs an average of how many letters there are per name, as well as prints them to the console concatenated with a space
		
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
		int[] array = {5, 25, 15, 13, 43};
		double[] arr = {10.5, 11, 15.9, 17.88, 88.9};
		double [] arr2 = {38.9, 77.6, 12.5, 9.1, 33.6};
		System.out.println(sum1);//Question 2 output//
		System.out.println(fullWord);//question 2 output//
		System.out.println(con("Hello", 5));//question 3//
		System.out.println(fullName("Alex", "Cerveny"));//question 4 output//
		System.out.println(willBuyDrink(true, 10.50));//question 8 output//
		System.out.println(myChoice(5, "Shih-tzu"));//question 9 output//
		System.out.println(numbers(array));//question 5 output//
		System.out.println(average(arr));//question 6 output//
		System.out.println(average2(arr, arr2));// question 7 output//
	}//end of main//
	//Question 3// This method takes a string and a int input, and then prints out the string inputed times the int inputed
	public static String con(String word, int n) {
		String fullWord = "";
		for(int i = 0; i < n; i++) {
			fullWord += word;
		}
		return fullWord;
	}
	//Question 5// this method an array of int as an argument, checks to see if the numbers in the array are equal to 100, and outputs true if it does, or false if it does not
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
	//Question 6// this method takes an array of double, adds up all the numbers in the array, and divides it by how long the array is, and then prints it to the console
	public static double average(double[] array) {
		double sum = 0;
		for (double number : array) {
			sum += number;
		}
		return sum / array.length;
	}
	//Question 7//this method takes 2 arrays(array and array2), adds up all the numbers in both arrays, then returns true if array > array2, and vice versa if array2 > array
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
	//Question 4//	This method takes 2 strings(firstName and lastName), and prints the full name with a space
		public static String fullName(String firstName, String lastName) {
		return firstName + " "  +lastName;
		}
	//Question 8// This method takes in a boolean statement and a double, and outputs true if it is hot outside and if you have enough money for a drink
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInTheBank) {
	
		return isHotOutside && moneyInTheBank >= 10.50;
		
	}
	//Question 9: i chose this problem as a way remember my families pets through the years//
	public static boolean myChoice(int number, String dogBreed) {
		
		return(number == 5 && dogBreed == "Shih-tzu" || dogBreed == "Golden Retriever" || dogBreed == "Rat Terrior" || dogBreed == "Schnauzer");
	}
}//end of class//