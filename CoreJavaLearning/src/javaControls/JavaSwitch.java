package javaControls;

public class JavaSwitch {
	
	public static void main(String[] args) {
//		System.out.println(findName(2));
	//	System.out.println(findNameByExpAndAge(2,26));
		System.out.println(findNameUsingSwitch(1));
		
		
		
		
	}
	
	
	
	public static String findNameUsingSwitch(int exp) {
		switch(exp){
			case  1 :
				return "VIPUN";
			case  2 :
				return "vinay";
			case  3 :
				return "Hema";
			default :
			
				return "Meghana";
		}
	}

}
