package practice;

public class missingnumberinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int array[]= {1,2,4,5,6};
	int totalnumbers=6;
		int totalsumofallnumbrs=(totalnumbers*(totalnumbers+1)/2);//n(n+1)/2
System.out.println(totalsumofallnumbrs);
int sum=0;
for(int i=0;i<array.length;i++) {
sum =sum+array[i];
	}
System.out.println(sum);

System.out.println("the missng number is "+(totalsumofallnumbrs-sum));
	
	}}
