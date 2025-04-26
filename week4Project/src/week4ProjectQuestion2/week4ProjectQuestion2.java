package week4ProjectQuestion2;

public class week4ProjectQuestion2 {

	public static boolean numbers(int[] numbers) {
		int sum = 0;
		for(int i = 0, i < numbers.length; i++){
			sum += numbers[i];
		}
		if(sum == 100) {
			return true;
		} else {
			return false;
		}
	}
}