package Arrays;

import java.util.Scanner;

public class ExecArrays1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int[] num = new int[] {2,5,1,3,4,9,7,8,10,6};
		int numuser,x;
	
		System.out.println("\nDigite o número que você deseja encontrar: ");
		numuser = leia.nextInt();
		 
		for(x=0;x<10;x++) {	
			if (num[x] == numuser) {
			 System.out.println("\nO número "+(numuser)+ " está localizado na posição: "+x);	
			}else if(x == num[x]){			
			System.out.println("\nO número "+(numuser)+ " não foi Localizado");	
			
		}
	}
	}	
}
