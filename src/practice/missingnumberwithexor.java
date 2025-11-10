package practice;

public class missingnumberwithexor {

	public static void main(String[] args) {
		int numbers[] = { 1, 2, 4, 5, 6 };
		int missingnumber = 0;
		for (int no : numbers) {
			missingnumber = missingnumber ^ no;
		}
		for (int i = 0; i <= 6; i++) {
			missingnumber = missingnumber ^ i;
	
		}
		System.out.println(missingnumber);
	}
	
}
