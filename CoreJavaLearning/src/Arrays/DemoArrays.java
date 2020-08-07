package Arrays;

public class DemoArrays {

	public static void main(String[] args) {
	
		String name[] = new String[11];
		
	name[0] = "vipun";
	name[1] = "vinay";
	name[2] = "sujatha";
	name[3] = "meghana1";
	name[4] = "vikas";
	name[5] = "shivani";
	name[6] = "shweta";
	name[7] = "vineet";
	name[8] = "vihaan";
	name[9] = "sumit";
	name[10] = "DEMO";
	
	
	for (int i = 0; i < name.length; i++) {
		System.out.println("Name  :"+name[i]);
		}
	
	System.out.println(name[3] + " vinay " +name[5] );	
	System.out.println(name[9]);	

	}

}
