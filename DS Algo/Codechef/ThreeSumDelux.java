import java.util.*;
public class ThreeSumDelux
{
  public static int count(int[] a)
  {
    int count=0;
    Arrays.sort(a);
    for(int i=0;i<a.length;i++)
    {
      for(int j=i+1;j<a.length;j++)
      {
        int s=-1*(a[i]+a[j]);
        int hi=a.length-1;
        int lo=0;
        int mid=(hi+lo)/2;
        while(hi>=lo)
        {
          mid=lo+(hi-lo)/2;
          if(s<a[mid]) hi=mid-1;
          else if(s>a[mid]) lo=mid+1;
          else break;
        }
        if(a[mid]==s&&a[mid]>a[j]) count++;
      }
    }
    return count;
  }
  public static void main(String[] args)
  {
    int a[]={30,-40,-20,-10,40,0,10,5};
    int cou=count(a);
    System.out.println(cou);
  }
}