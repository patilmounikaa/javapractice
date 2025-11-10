package practice;

public class sumofarray {

	public static void main(String[] args) {
		int nums[]= {1,24,33,44};
int sum=0;
for(int index=0;index<=nums.length-1;index++) {//traversing thru each index to pull the value

sum=sum+nums[index];//adding the value to sum and staoring in sum each tym

	}
System.out.println(sum);
}
}