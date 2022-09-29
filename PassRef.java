package Level2;

public class PassRef {
	public static void main(String[]args) {
	   Laddu laddu=new Laddu();
		System.out.println("size of laddu..:"+laddu.size);
		PassByRef obj=new PassByRef();
		obj.pbv(laddu.size);
		System.out.println("size of laddu..:"+laddu.size);
		System.out.println("size of laddu before passing reference..:"+laddu.size);
		obj.pbr(laddu.size);
		System.out.println("size of laddu after passing reference..:"+laddu.size);
		
		public void pbv(int size) {
			size=size-5;
		}
				public void pbv(laddu laddu) {
					Laddu.size=Laddu.size-5;
					
				}
			
			class laddu{
				int. size=10;
			
		}
	}

}
