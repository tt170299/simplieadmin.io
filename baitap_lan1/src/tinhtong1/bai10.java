package tinhtong1;

import java.util.Scanner;

public class bai10 {

	public static void main(String[] args) 
	{ int n, FS,FT,FTG,F,j;
		Scanner input=new Scanner (System.in);
		System.out.println("nhap gia tri n");
 n=input.nextInt();

F=1;
FT=0;
FS=1;

	for (int j1 = 2; j1 <= n; j1++)
	{		FTG=FS;
	FS=FS+FT;
	FT=FTG;
	F=FT+FS;

}
	System.out.println("F="+F);}
}

