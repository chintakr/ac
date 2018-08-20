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
		int i,k;
		Scanner sc=new Scanner(System.in);
		s1=sc.nextLine();
		k=sc.nextInt();
            	char[] ch=s1.toCharArray();
		for(i=0;i<k;i++)
		{
			System.out.print(ch[i]);
		}
	}
}
