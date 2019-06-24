package cg;

public class Calculator {
	public int add(int a, int b) {
		if(a>=0 && b>=0)
			return a+b;
		return 0;
	}
	
	public static int idgenerator() {
		int no=(int) (Math.random()*1000);
		return no;
	}
}
