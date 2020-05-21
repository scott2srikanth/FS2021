/*

#Triplet Sum
Given an array of numbers find unique triplets such that the sum of the triplets is zero. 
The solution set must not contain duplicate triplets.Find the number of such triplets in the array

Example:-
Given array nums = [-1, 0, 1, 2, -1, -4],
A solution set is:
[
  [-1, 0, 1],
  [-1, -1, 2]
]
Therefore the required output  is 2 

Input format:-
Number of elements in an array
Next  line n elements of array separated by a comma
Output format:-
Number of triplets
"""
"""
Input
5
-1,0,1,2,-1
Expected output
2
------------------
Input
6
-2,3,5,-8,10,-15
Expected output
3
--------------
Input
7
-1,0,1,2,-1,-2,3
Expected output
4

"""

*/
import java.util.Scanner;
public class TripletSum{
    public static void findNoOfTriplets(int size,int[] arr){
        int count=0;
        for(int i=0;i<size-2;i++){
            for(int j=i+1;j<size;j++){
                if(j+1<size){
                    int sum=arr[i]+arr[j]+arr[j+1];
                    if(sum==0)
                        count++;
                }
                
            }
        }
        System.out.println(count);
    }
    public static void main(String[] par){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        sc.nextLine();
        String sarr[]=sc.nextLine().split(",");
        int[] arr=new int[size];
        for(int i=0;i<size;i++)
            arr[i]=Integer.parseInt(sarr[i]);
        
        findNoOfTriplets(size,arr);
    }
}