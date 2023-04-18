package study15_2;

public class GenericEx {
	
	public static <T> void printArray(T[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		
		Integer[] intArr = {1, 2, 3};
		String[] strArr = {"Hello", "World"};
		
		printArray(intArr);
		printArray(strArr);
		
		/*
		 * 1
		 * 2
		 * 3
		 * Hello
		 * World
		 */
		
	}
	
}
