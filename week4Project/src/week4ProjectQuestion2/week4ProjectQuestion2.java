package week4ProjectQuestion2;

public class week4ProjectQuestion2 {
//Question2
public static int main1(String[] args) {
	
	String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
	int average = 0;
	for(int i = 0; i <= names.length; i++) {
		
		average += names[i].length();
	}
	return average / names.length;
	}
}