package tinhtong1;

import java.util.Scanner;

public class bai11 {

	public bai11() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int m,n,i,j,S;
m=10;
i=1;
S=0;
Scanner input=new Scanner (System.in);
System.out.println("nhap gia tri n");
n=input.nextInt();

while(n>=m)
{
	m=n*10;
	i=i+1;
	}
for ( j=1; j<=i; j++)
	{m=m/10;
	S += n/m;
	n=n/10;
	}
	}
}

