package Level2;

public class Arraydemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int []arr=new int[4];
    String s[]=new String[3];
    arr[1]=1000;
      for (int i:arr){
    	System.out.println(i);
    	
      }
    	//OLD FOR LOOP
    	for(int i=0;i<arr.length;i++) {
    		System.out.println(arr[i]);
    	
    }
    s[0]="new college";
    s[1]="loyal college";
    s[2]="nandam college";
    for(String str:s)
    {
    	System.out.println(str);
    }
	
}
}
