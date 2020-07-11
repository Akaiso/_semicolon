/*Write a program that prints out the first eleven multiples of 5 starting from 1 to 100
 
 */
public class FirstElevenMultiple {
	public static void main(String[] args) {
		int i;
		int count;


int j = 0; //if declared in the body of the "for loop", it won't work only as a global variable
for(i=1; i<=100; i++) {
	
	if(i%5 != 0) {
		continue;//this if statement was later introduced to reduce the stress of the compiler examining every condition
	}
	if(i%5 == 0) {
		System.out.printf("%d ", i);
		
		j++;
	
	}
	if(j == 11) {
		break;
		
	}
	
}	
}
}
	