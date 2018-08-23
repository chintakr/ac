/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,r,r1,sum=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		while(n>0)
		 {
		 	r=n%10;
		 	sum=sum*10+r;
		 	n=n/10;
		 }
		 while(sum>0)
		 {
		 	r1=sum%10;
			if(r1%2==0);
		 	else
		 	{
		 		System.out.print(" "+r1);
		 	}
		 	sum=sum/10;
		 }
	}
}
