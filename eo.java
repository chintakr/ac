/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,m,sum=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		m=sc.nextInt();
		sum=n+m;
		if(sum%2==0)
		{
			System.out.println("even");
			
		}
		else
		{
			System.out.println("odd");
		}
	}
}
