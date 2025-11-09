package practice;

public class countofcharinlastword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s=  "     Hello Mounika    ";
	s=s.trim();	
	int count=0;
		System.out.println(s);
		char inputarray[]=s.toCharArray();
		for(int i=inputarray.length-1;i>=0;i--)
		{if(inputarray[i] != ' ')
		{count= count+1;
		}
		else {
			if(count>0)//this condition for trim if not be used it still works becoz here u r checking if count>0 for spaces without trim
			{
			System.out.println(count);}
		break;
	}}

}}
