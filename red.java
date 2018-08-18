/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String s1;
		int k,i;
		char ch;
		Scanner sc=new Scanner(System.in);
		s1=sc.nextLine();
		k=sc.nextInt();
		for(i=0;i<k;i++)
		{
			 ch=s1.charAt(i);
			 System.out.print(ch);
		}
	}
}
