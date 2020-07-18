import java.util.Scanner;
public class ARRAYSUB
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] a=new int[n];
    for(int i=0;i<n;i++)
      a[i]=sc.nextInt();
    int k=sc.nextInt();
    int[] max=new int[n];
    int j=0;
    for(int i=0;(i+k-1)<n;i++)
    {
      max[j++]=maxel(a,i,i+k-1);
    }
    for(int i=0;i<j;i++)
      System.out.print(max[i]+" ");
    System.out.println();
  }
  public static int maxel(int[] a, int i,int j)
  {
    int max=a[i];
    for(int k=i;k<=j;k++)
    {
      if(max<a[k]) max=a[k];
    }
    return max;
  }
}
      
                     