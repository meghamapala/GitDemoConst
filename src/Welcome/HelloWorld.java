package Welcome;

public class HelloWorld {
	
	int ab ;
	String fg;

		
	//	public HelloWorld() {
	//	}
	//	
		public HelloWorld(int xy) {
		  ab = xy;
		}
		
		public HelloWorld(int ss,String zz) {
			ab = ss;
			fg = zz;
		}
		
public static void main(String[]args) {
			
			HelloWorld dd	=new HelloWorld(500);
			System.out.println(dd.ab);
			HelloWorld dd1	=new HelloWorld(500,"Name");
			System.out.println(dd1.ab+"  "+dd1.fg);

			
		
		}

	}


