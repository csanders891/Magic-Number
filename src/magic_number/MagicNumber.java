package magic_number;

import java.util.Scanner;

public class MagicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name");
		String name = sc.next();
		int magicNumber = 0;
		int sum = 0;
		int code = 0;
		for(int i = 0; i < name.length(); i++)
		{
			char ch = name.charAt(i);
			
			if(ch == 'A' || ch == 'a')
				code = 1;
			
			if(ch == 'B' || ch == 'b')
				code = 2;
			
			if(ch == 'C' || ch == 'c')
				code = 3;
			
			if(ch == 'D' || ch == 'd')
				code = 4;
			
			if(ch == 'E' || ch == 'e')
				code = 5;
			
			if(ch == 'F' || ch == 'f')
				code = 6;
			
			if(ch == 'G' || ch == 'g')
				code = 7;
			
			if(ch == 'H' || ch == 'h')
				code = 8;
			
			if(ch == 'I' || ch == 'i')
				code = 9;
			
			if(ch == 'J' || ch == 'j')
				code = 10;
			
			if(ch == 'K' || ch == 'k')
				code = 11;
			
			if(ch == 'L' || ch == 'l')
				code = 12;
			
			if(ch == 'M' || ch == 'm')
				code = 13;
			
			if(ch == 'N' || ch == 'n')
				code = 14;
			
			if(ch == 'O' || ch == 'o')
				code = 15;
			
			if(ch == 'P' || ch == 'p')
				code = 16;
			
			if(ch == 'Q' || ch == 'q')
				code = 17;
			
			if(ch == 'R' || ch == 'r')
				code = 18;
			
			if(ch == 'S' || ch == 's')
				code = 19;
			
			if(ch == 'T' || ch == 't')
				code = 20;
			
			if(ch == 'U' || ch == 'u')
				code = 21;
			
			if(ch == 'V' || ch == 'v')
				code = 22;
			
			if(ch == 'W' || ch == 'w')
				code = 23;
			
			if(ch == 'X' || ch == 'x')
				code = 24;
			
			if(ch == 'Y' || ch == 'y')
				code = 25;
			
			if(ch == 'Z' || ch == 'z')
				code = 26;
			
			sum+=code;
		}
		
		if(sum < 10)
			magicNumber = sum;
			
			
		else 
		{
			while (sum >=10)
			{
				if (sum >=10 && sum <=99)
				{
					int tens = sum / 10;
					int ones = sum % 10;
					magicNumber = tens + ones;
					sum = magicNumber;		
				}
				
				else if(sum >=100 & sum <=999)
				{
					int hundreds = sum / 100;
				    int tens = (sum / 10) % 10;
				    int ones = sum % 10;
				    magicNumber = hundreds + tens + ones;
				    sum = magicNumber;	
				}
			
			}
			
		}	
		System.out.println("Your magic number is " + magicNumber);
	
	}
}
