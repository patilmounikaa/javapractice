package practice;

public class evenwordsinastring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name="My name is not Mounika";
	String dataArray[]=name.split(" ");	
		for(String word:dataArray) { //this string array is splitting the name into diff string and getting stored in word
		int length=word.length();
		if(length%2==0) {
			System.out.println(word);
		}
	}

}}
