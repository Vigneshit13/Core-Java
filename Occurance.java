package test;
import java.util.*;
public class Occurance {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the String:");
		String string=scanner.nextLine();
		String string2=string;
		for (int i = 0; i < string.length(); i++) {
			int count=0;
			for (int j = 0; j < string2.length(); j++) {
				if((string.charAt(i))==(string2.charAt(j))){
					count++;
				}
			}
			System.out.println("Character "+string.charAt(i)+" has "+count+" Occurance");
/*
			switch (count) {
			case 1:
				System.out.println("Character "+string.charAt(i)+" has "+count+" Occurance");
				break;
			case 2:
				System.out.println("Character "+string.charAt(i)+" has "+count+" Occurance");
			case 3:
				System.out.println("Character "+string.charAt(i)+" has "+count+" Occurance");
			case 4:
				System.out.println("Character "+string.charAt(i)+" has "+count+" Occurance");

			default:
				break;
			}*/
		}
	}

}
