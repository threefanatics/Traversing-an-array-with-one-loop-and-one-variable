/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Random; 

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Random rand = new Random();
	    int rows = 20;
	    int cols = 10;
	    int arr[][] = new int[rows][cols];
	    
	    for(int i=0;i<rows*cols;i++) //traversing an array with only one variable and one loop
	    {
	        arr[i/rows][i%cols] =  rand.nextInt(1000);
	    }
	    
	    for(int i=0;i<rows*cols;i++) //traversing an array with only one variable and one loop
	    {
	        System.out.println(arr[i/rows][i%cols]);
	    }
	}
}
