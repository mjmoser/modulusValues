import java.util.Scanner;
 
class modulusValues {
    public static void main(String args[]) {
		String answer;
		Scanner scanner = new Scanner(System.in);	
		int answer1;
		int answer2;
		int answer3;
			
		System.out.println("Enter the first number:");
		answer1 = scanner.nextInt();
		
		System.out.println("Enter the second number:");
		answer2 = scanner.nextInt();
		
		System.out.println("Enter the third (larger) number:");
		answer3 = scanner.nextInt();
				
		if (answer3 <= answer2); {
				System.out.println("Third number is less than second number.");
			}
			      
		for (int i = answer2; i <= answer3; i++) { 
			if(i % answer1 == 0){ 
				System.out.println(i);
			}	
			
		}
	} 
}	
