package kiemtra1tiet;
import java.util.Scanner;
public class sinhvien {

		private static final String diemtrungbinh = null;
		private String masv;
		private String hoten;
		private float diemlythuyet;
		private float diemthuchanh;
		
		
		public sinhvien(String masv, String hoten, float diemlythuyet, float diemthuchanh) {
			super();
			this.masv = masv;
			this.hoten = hoten;
			this.diemlythuyet = diemlythuyet;
			this.diemthuchanh = diemthuchanh;
		}	
			public sinhvien() {
			// TODO Auto-generated constructor stub
		}
			public void nhap() {
		        Scanner scanner = new Scanner(System.in);   
		        System.out.println("Nhập họ tên sinh viên: ");
		        hoten = scanner.nextLine();
		        
		        System.out.println("Nhập điểm lý thuyết: ");
		        diemlythuyet = scanner.nextFloat();
		       
		        System.out.println("Nhập điểm thực hành: ");
		        diemthuchanh = scanner.nextFloat();
		       
		    
		
			}
		public String getmasv() {
			return masv;
		}
		public void setMa(String ma) {
			this.masv = masv;
		}
		public String getTen() {
			return hoten;
		}
		public void setTen(String hoten) {
			this.hoten = hoten;
		
		}
		public float getdiemthuchanh() {
			return diemthuchanh;
		}
		public void setthuchanhn(float diemthuchanh) {
			this.diemthuchanh = diemthuchanh;
		}
		public float getdiemlythuyet() {
			return diemlythuyet;
		}
		
		public void setdiemlythuyet(float diemlythuyet) {
			this.diemlythuyet = diemlythuyet;

	}
		public float diemtrungbinh(float diemthuchanh, float diemlythuyet ) {
	        return (diemlythuyet + diemthuchanh ) / 2;

}
		 public String xepLoaiHocLuc(float diemtrungbinh) {
		        if (diemtrungbinh >= 5 && diemtrungbinh <= 10) {
		            return " đậu";
		        }
		        if (diemtrungbinh <=5 ) {
		            return "Trượt";
		        }
		       
		        return "Nhập sai!";
		    }
		 public static void main(String[] args) {
			    
			    sinhvien sinhvien = new sinhvien();
			     
			    
			    sinhvien.nhap();
			     
			    
			    System.out.println(sinhvien.diemlythuyet);
			     
			    
			    System.out.println(sinhvien.xepLoaiHocLuc(
			            sinhvien.diemtrungbinh(sinhvien.diemlythuyet, sinhvien.diemthuchanh)));
			}

}