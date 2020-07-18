import java.util.Scanner;
import java.util.Arrays;
public class Challenge
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int v=sc.nextInt();
    int n=sc.nextInt();
    int[] a=new int[n];
    for(int i=0;i<n;i++)
      a[i]=sc.nextInt();
    int ans=binarySearch(a,v);
    Arrays.sort(a);
    System.out.println(ans);
  }
  public static int binarySearch(int[] a,int item)
  {
    int lo=0; 
    int hi=a.length-1;
    while(hi>=lo)
    {
      int mid=lo+(hi-lo)/2;
      if(a[mid]>item) hi=mid-1;
      else if(a[mid]<item) lo=mid+1;
      else return mid;
    }
    return -1;
  }
}
    