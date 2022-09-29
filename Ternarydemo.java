package Level2;

public class Ternarydemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //ternary operator-?
		
		int a=10;
		int b=20;
		
		//string result =(a<b)"a is lesser than b";"b is lesser than a";
		//boolean result=(a>b)?100:200;
		boolean result=(a<b)?(a!=10)?
				true:false:false;
		System.out.println(result);
	
	}

}
