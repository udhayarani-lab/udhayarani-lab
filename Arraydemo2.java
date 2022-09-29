package Level2;

public class Arraydemo2 {

	public static void main(String[] args) {
		
          int[][]arrtwo={
        	  {1,2,3,4,5},
        	  {10,20,30,40,50},
        	  {100,200,300,400,500}
          };
          System.out.println(arrtwo.length);
          System.out.println(arrtwo[0].length);
          
          System.out.println(arrtwo[1][2]);
          System.out.println(arrtwo[2][4]);
          
          for(int i=0;i<arrtwo.length;i++) {
        	  for(int j=0;j<arrtwo[i].length;j++) {
        		  System.out.println(arrtwo[i][j]+"\t");
        	  }
        	  System.out.println();
        	  
        	  }
          for(int i[]:arrtwo)
          {
        	  for(int j:i) {
        		  System.out.println(j+"\t");
        		  
        	  }
        	  System.out.println();
        	  
          }
	}
}



