package c03_arrays;

public class EachNumberCount {

	public static void main(String[] args) {
		
		int arr[] = {2,4,2,5,6,4,4};
		boolean visited[] = new boolean[arr.length];
		
		for(int i = 0; i < arr.length; i++) {
			
			int count = 1;
			if(visited[i] == false) {
				
				for(int j = i+1; j < arr.length; j++) {	
					if(arr[i] == arr[j]) {
						
						visited[j] = true;
						count++;
					}
				}	
				System.out.println(arr[i] + " occurs " + count + " times");
			}
		}
	}
}
