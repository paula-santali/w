package Strings;
import java.util.Scanner;



public class CharPrint {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Input name");
		String str=sc.next();
		System.out.println("\n");
		for(int i=0;i<str.length();i++){
		System.out.println(str.charAt(i));
	}
}
}
