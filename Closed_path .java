import java.util.Scanner;
 class Closed_path {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter a number:");
		int n = s.nextInt();
		int temp = n;
		int c = 0;
		while(n!=0)
		{
			int rem = n%10;
			n = n/10;
			if (rem == 0 || rem == 4 || rem == 6 || rem == 9)
				c = c+1;
			else if(rem == 8)
				c = c+2;
			
		}
		
		System.out.println(c);
		
		
		
	}

}