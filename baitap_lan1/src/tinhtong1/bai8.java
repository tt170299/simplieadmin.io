package tinhtong1;

import java.util.Scanner;

public class bai8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=2;
		float s=1;
		long n;
		Scanner input=new Scanner (System.in);
		System.out.println("nhap gia tri n");
		n=input.nextLong();
		while (i<n)
		{ s=s+ 1/i;
		i++;
		}
		System.out.println(" s=" +s);
	
	}
}