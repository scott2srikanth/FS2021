import java.util.*;
class Prison 
{
    public static void main(String[] args)
    {
    Scanner sc =new Scanner (System.in);
    int n=sc.nextInt();
    int d=sc.nextInt();
    int[] a=new int[n];
    for(int i=0;i<n;i++)
    {
     a[i]=sc.nextInt();
    }
    a[0]=0;
    for(int i=0;i<d;i++)
    {
        for(int j=1;j<n-1;j++)
    {
        if(a[j-1]==a[j+1]){a[j]=1;}
        else {a[j]=0;}
        if (j==1) {a[n-1]=0;}
    }
    }
    for(int i=0;i<n;i++)
    {
     System.out.print(a[i]+" ");
    }
}
}