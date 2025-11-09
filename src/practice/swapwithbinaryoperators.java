package practice;

public class swapwithbinaryoperators {//bitwise operations performance is fast

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=10;

int b=20;
	a=a^b;
	System.out.println(a);
	b=a^b;
	System.out.println(b);
	a=a^b;
	System.out.println(a);
	}

}
//^ EXOR operator->0+1=1;0+0=0;1+1=0;divide the number by 10 till u get o in divisor