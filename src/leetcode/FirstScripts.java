package leetcode;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FirstScripts {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in); //System.in is a standard input stream.
		System.out.print("Enter a string: ");
		String str= sc.nextLine(); //reads string.
		
		String output = str.replaceAll("[\\s-]+", "_").toLowerCase();
		
		DateFormat df = new SimpleDateFormat("dd_MM_yyyy");
		String data = output + df.format(new Date());
		
		
		//String finalString = output+ new Date().toString();
		System.out.println(data);
		
	}

}
