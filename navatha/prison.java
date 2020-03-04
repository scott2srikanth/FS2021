/*
 * 
 There are 8 prison cells in a row, and each cell is either occupied or vacant.

Each day, whether the cell is occupied or vacant changes according to the following rules:

If a cell has two adjacent neighbors that are both occupied or both vacant, then the cell becomes occupied.
Otherwise, it becomes vacant.
(Note that because the prison is a row, the first and the last cells in the row can't have two adjacent neighbors.)

We describe the current state of the prison in the following way: cells[i] == 1 if the i-th cell is occupied, else cells[i] == 0.

Given the initial state of the prison, return the state of the prison after N days (and N such changes described above.)


Example 1:

Input:0 1 0 1 1 0 0 1
7
Output: [0, 0, 1, 1, 0, 0, 0, 0]
Explanation: 
The following table summarizes the state of the prison on each day:
Day 0: [0, 1, 0, 1, 1, 0, 0, 1]
Day 1: [0, 1, 1, 0, 0, 0, 0, 0]
Day 2: [0, 0, 0, 0, 1, 1, 1, 0]
Day 3: [0, 1, 1, 0, 0, 1, 0, 0]
Day 4: [0, 0, 0, 0, 0, 1, 0, 0]
Day 5: [0, 1, 1, 1, 0, 1, 0, 0]
Day 6: [0, 0, 1, 0, 1, 1, 0, 0]
Day 7: [0, 0, 1, 1, 0, 0, 0, 0]


Example 2:

Input:1 0 0 1 0 0 1 0
1000000000
Output: [0, 0, 1, 1, 1, 1, 1, 0]
 

Note: Print Array as output using Arrays.toString

cells.length == 8
cells[i] is in {0, 1}
1 <= N <= 10^9
Accepted


 */



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class prison {

	
	 public static void main(String[] args) throws IOException {

		   // write your code here
		   Scanner sc=new Scanner(System.in);
		  String n=sc.nextLine();
		   String arr[]=n.split(" ");
		   int cells[]=new int[arr.length];
		   for(int i=0;i<arr.length;i++)
		   {
		       cells[i]=Integer.parseInt(arr[i]);
		   }
		   
		   int c[]=new int[arr.length];
		   Long n1=sc.nextLong();
		   
		   for(int j=0;j<n1;j++)
		   {
		       c[0]=0;
		   c[arr.length-1]=0;
		   for(int i=1;i<arr.length-1;i++){
		       if(cells[i-1]==cells[i+1])
		       {
		           c[i]=1;
		       }
		       else if(cells[i-1]!=cells[i+1])
		       {
		           c[i]=0;
		       }
		       
		   }
		   for(int i=0;i<arr.length;i++)
		   {
		       cells[i]=c[i];
		   }
		   }
		   for(int h=0;h<arr.length;h++)
		   {
		       System.out.println(c[h]);
		   }
		   
	    } 
	
}
