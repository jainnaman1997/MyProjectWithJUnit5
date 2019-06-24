package cg;

public class Validator {

	public boolean validateNo(String data) {
		return data.matches("\\d+");
	}
	
	public boolean isPalindrome(String data) {
		StringBuffer sb=new StringBuffer(data);
		String reserveS=sb.reverse().toString();
		return data.equals(reserveS);
	}

	public int getSizeMl(Size size) {
		// TODO Auto-generated method stub
		System.out.println(size+" "+size.getMl());
		return size.getMl();
	}
}
