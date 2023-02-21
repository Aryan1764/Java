package test1;

import java.util.*;
import java.io.*;


public class PalindromeUsingStringBuffer
{ 
	public static void main(String args[])
	{
	        Scanner sc = new Scanner(System.in);
	        String S = sc.nextLine();
	        StringBuffer input1= new StringBuffer();
	        input1.append(S);
	        input1.reverse();
	        String s2 = input1.toString();
	        
	        if (s2.equals(S)) {
	        	System.out.println("YES");
	        	
	        }
	        else {
	        	System.out.println("NO");
	        }
}
}
	        