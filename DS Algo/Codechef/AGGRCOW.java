import java.util.Scanner;
import java.util.Arrays;
public class AGGRCOW
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0)
    {
      int n=sc.nextInt();
      int c=sc.nextInt();
      int[] a=new int[n];      
      for(int i=0;i<n;i++)
      {
        a[i]=sc.nextInt();
      }
      Arrays.sort(a);
      int lo=0;
      int hi=(a[n-1]-a[0]+1);
      while(hi>lo)
      {
        int mid=(lo+(hi-lo+1)/2);
        if(p(a,c,mid))
        {
          lo=mid;
        }
        else{
          hi=mid-1;
        }
        //System.out.println(lo);
      }
      System.out.println(lo);
     
    }
  }
    public static boolean p(int[] a,int c,int mid)
    {
      int cowplaced=1,lastpos=a[0];
      for(int i=1;i<a.length;i++)
      {
        if((a[i]-lastpos)>=mid)
        {
          ++cowplaced;
          if(cowplaced==c) return true;
          lastpos=a[i];
        }
      }
      return false;
      
    }
  }
