package Level2;

public class Arraydemo1 {

	public static void main(String[] args) {
	int x=10;
	//array
	int[]nums= {10,20,30,40};
	//how to read an array
	System.out.println(nums[3]);
	System.out.println(nums.length);
	//how to assign a value in a array
	System.out.println(nums[1]);
	nums[1]=100;
	System.out.println(nums[1]);
	for(int i=0;i<nums.length;i++);
	System.out.println(nums[1]);
	
	for(int i:nums)
		System.out.println(1);
			

	}

}
