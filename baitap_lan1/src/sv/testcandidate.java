package sv;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class testcandidate {

	public static void main( String[] args) throws NumberFormatException, IOException{
		System.out.println("nhap so luong thi sinh");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		System.out.println("so luong thi sinh" +n);
		Staff nv[]= new Staff[n];
		
		for(int i=0;i<n;i++) {
			System.out.println("nhap ma thi sinh");
			String ma=br.readLine();
			System.out.println("nhap diem toan");
			Float diemtoan=br.readLine()
		}
		
		
	}
	
	
	

}
