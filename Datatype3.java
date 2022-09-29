package datatype.revision;

public class Datatype3 {
	 static int mm;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           
           System.out.println(mm);
           int a[]=new int[4];
           
           
           a[0]=100;
           a[1]=200;
           a[2]=300;
           a[3]=400;
           
           System.out.println(a[3]);
           int b[]=a;
           a=new int[5];
          // System.out.println(a[0]);
          // System.out.println(b[0]);
           int newarr[]=new int[10];
           int n;
           System.arraycopy(a,0,newarr,0,a.length);
           System.out.println(newarr[0]);
           //system.out.println(n);
           
	}

}
