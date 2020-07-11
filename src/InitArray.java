//Initializing the elements of an array to default values of zero
/*public class InitArray {
	public static void main(String[] args) {
		//declare variable array and initialize it with an array object
		int[] array = new int[10]; // create the array object
		int[] array1 = {1,6,8,9,7,3,5,2,9,8,2};
		System.out.printf("%s%8s%n", "Index", "Value"); //column headings
		
		//output each array element's value
		for (int counter = 0; counter < array.length; counter++) {
			if(counter == array1[7] || counter == array1[9])
				continue;
			System.out.printf("%5d%8d%n", counter, array[counter]);
		}
	}

}

*/

public class InitArray {
	public static void main(String[] args) {
		//initialize list specifies the initial value for each element
		
		int[] array = {32,27,64,18,95,14,90,70,60,37};
		System.out.printf("%s%8s%n", "Index", "Value"); //column headings
		
		//output each array element's value
		for (int counter = 0; counter < array.length; counter++) {
			//if(counter == array[7] || counter == array[9]) this is wrong
				//continue;
			System.out.printf("%5d%8d%n", counter, array[counter]);
		}
	}

}
