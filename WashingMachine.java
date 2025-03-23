//package Java_Tutorials_23_March_2025;
import java.util.Scanner;

public class WashingMachine {
	public static void main(String[] args) {
		WashingMethod washingMethod = new WashingMethod();
		washingMethod.selectMode();
	}
}

class WashingMethod {

	void modeOperation(String mode, int[] temp, int[] spin) {
		Scanner sc = new Scanner(System.in); 
		
		System.out.println(mode + " mode is selescted.");
		System.out.println("Select the tempearature : " + temp[0] + " / " + temp[1] + " / " + temp[2] );
		int tempInput = sc.nextInt();
		System.out.println(tempInput + " is selected.");
		System.out.println("Select the spin : " + spin[0] + " / " + spin[1] + " / " + spin[2]);
		int spinInput = sc.nextInt();
		System.out.println(spinInput + " is selected");
		System.out.println(mode + " mode is on : and temp " + tempInput + " and spin " + spinInput + " is selected..!!");
	} // modeOperation
	
	void selectMode() {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;	
		while (flag) {
			System.out.println();
			System.out.println("Select the mode :  mix / quick / duvet / care / exit ");
			String mode = sc.next();
			
			switch (mode) {
			case "mix":
				int[] mixTemp = {20,30,40};
				int[] mixSpin = {800,1000, 1200};
				modeOperation(mode, mixTemp, mixSpin); 
				break;

			case "quick":
				int[] quickTemp = {20, 30, 40};
				int[] quickSpin = {400, 800, 1000};
				modeOperation(mode, quickTemp, quickSpin); 
				break;

			case "duvet":
				int[] duvetTemp = {20, 30, 40};
				int[] duvetSpin = {800,600, 1000};
				modeOperation(mode, duvetTemp, duvetSpin); 
				break;
				
			case "care":
				int[] careTemp = {20, 40, 50};
				int[] careSpin = {400, 600, 1000};
				modeOperation(mode, careTemp, careSpin); 
				break;

			case "exit":
				flag = false;
				System.out.println("Machine is stopped..!!");
				break;
				
			default:
				System.out.println("Please enter valid selection..!!");																					
			} // switch(mode)
		} // while(true)
	} // selectMode()
} // class WashingMethod


