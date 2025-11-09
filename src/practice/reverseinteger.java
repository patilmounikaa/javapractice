package practice;

public class reverseinteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int number=-123;//assignment n declaration
int reversenumber=0;
int lastdigit;//declaration

while( number !=0){ //until numer becomes zero run the loop
	
	lastdigit=number%10;

reversenumber=reversenumber*10+lastdigit;
number=number/10;
}	
	System.out.println(reversenumber)	;
		
	}

}
