package arrays;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] n = {"a", "b","c","d"} ;
		//2. print the third element in the array
		System.out.println(n[2]);
		//3. set the third element to a different value
		n[2]="lol";
		//4. print the third element again
		System.out.println(n[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(int i=0; i<n.length; i++) {
			System.out.println(n[i]);
		}
		
		//6. make an array of 50 integers
		int[] m = new int[50];
		for(int i=0; i<50;i++) {
			m[i]=i+1;
		}
	
		//7. use a for loop to make every value of the integer array a random number
		
		//8. without printing the entire array, print only the smallest number in the array
		
		//9 print the entire array to see if step 8 was correct
		
		//10. print the largest number in the array.
	}
}
