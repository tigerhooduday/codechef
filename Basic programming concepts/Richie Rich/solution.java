/* package codechef; // don't place package name! */

import java.util.*;
//import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class solution
{
	public static void main (String[] args) throws java.lang.Exception
	{
        
        Scanner sc = new Scanner(System.in);
        int numberOftestcase  = sc.nextInt();
        while(numberOftestcase>=0)
        {
            int num1 = sc.nextInt();
            int num = sc.nextInt();
            int year  = sc.nextInt();

        
            System.out.println((num-num1)/year);

            numberOftestcase--;
        }
	}
}
