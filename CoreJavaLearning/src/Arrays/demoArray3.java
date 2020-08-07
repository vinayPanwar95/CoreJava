package Arrays;
// program to find min value of an array
public class demoArray3 {

	public static void main(String[] args) {
		
		int arr[] = {33, 3, 4, 5, 0, 45};
		
		System.out.println(min(arr));
		
	}
	
	public static int min(int arr[]) {
		
		int min = arr[0];
		
		for(int i : arr) {
			
			if( min > i ) {
				
				min = i;
			}
			
		}
		return min;
	}

}
