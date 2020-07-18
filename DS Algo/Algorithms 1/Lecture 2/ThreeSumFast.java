import java.util.Arrays;
public class ThreeSumFast// a n^2*logn Algorithm
{
  public static int count(int[] a)
  {
    int N=a.length;
    int count =0;
    Arrays.sort(a);
    for(int i=0;i<a.length;i++)
    {
      for(int j=i+1;j<a.length;j++)
      {
        int k=binarysearch(a,-(a[i]+a[j]));
        if(k>j) count++;
      }
    }
    return count;
  }
  
  public static int binarysearch(int[] a, int k)
  {
    int lo=0;
    int hi=a.length-1;
    while(lo<=hi)
    {
      int mid=(hi+lo)/2;
      if(a[mid]<k) lo=mid+1;
      else if(a[mid]>k) hi=mid-1;
      else return mid;
    }
    return -1;
  }
  
  public static void main(String[] args)
  {
  }
}