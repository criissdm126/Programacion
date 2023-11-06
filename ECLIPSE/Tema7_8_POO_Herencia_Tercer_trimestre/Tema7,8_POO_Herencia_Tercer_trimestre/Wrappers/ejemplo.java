package Wrappers;

public class ejemplo {

	public static void main(String[] args) {
		
		int a = 4;
		Integer b=5;
		
		String num = " 6 ";
		System.out.println(num.trim());
		String num2 = num.trim();
		
		int c = Integer.parseInt(num2);
		//Integer c = Integer.parseInt(num2);
		System.out.println(c+3);
		
		//System.out.println(c);
		
		Integer d = Integer.valueOf(num2);
		System.out.println(d);
		
		int e = Integer.valueOf(num2).intValue();
		System.out.println(e);
		
		Integer.max(a, b);

	}

}
