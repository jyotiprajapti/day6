package day6L;

public class Fibbo {
	public static void main(String[] args) {
		int n=15;
		int a=0, b=1;
		int c;
		for(int i=1; i<=n; i++) {
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
			
			
		}
	}
}
