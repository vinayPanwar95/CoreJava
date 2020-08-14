package javaControls;

public class if_else_nestedIf {
	public static void main(String[] args) {
		System.out.println(findName(2));
		System.out.println(findNameByExpAndAge(2,26));
		
		
		
		
	}
	
	public static String findName(int exp) {
		
		if(exp == 1) {
			return "VIPUN";
		}
		else if(exp == 2) {
			return "HEMA";
		} 
		else if(exp == 3) {
			return "Vinay";
		}
		else {
			return "Meghana";
		}
		
	}
	
	public static String findNameByExpAndAge(int exp, int age) {
		if (exp == 1) {
			if(age == 25) {
				return "VIPUN";
			}
			return "Hema";
		}
		else {
			return "vinay";
		}
	}
	
	
}
