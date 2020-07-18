import java.lang.*;
import java.util.*;
import java.io.*;

public class BinarySearch
{
  //The Simple Binary Search 
  public static int binary_search(int[] a,int target)
  {
    int lo=0;
    int hi=a.length-1;
    
    while(lo<=hi)
    {
      int mid=lo+(hi-lo)/2;
      if(a[mid]==target) return mid;
      else if(a[mid]<target)
      {
        lo=mid+1;
      }
      else
        hi=mid-1;
    }
    return -1;
  }
  
  // Finding index for which p(x) is true for first time
  // NO NO NO NO NO NO YES YES YES YES finding first index of YES.
  public static int lower_bound(int lo,int hi)
  {
    while(lo<hi)
    {
      int mid=lo+(hi-lo)/2;
      if(p(mid)==true)
        hi=mid;
      else
        lo=mid+1;
    }
    return lo;
  }
  static boolean[] ar={false,false,false,true,true};
  static boolean p(int id)
  {
    return ar[id];
  }
  
  
  public static int upper_bound(int lo,int hi)
  {
    while(hi>lo)
    {
      int mid=lo+(hi-lo+1)/2;
      if(p(mid))
        hi=mid-1;
      else
        lo=mid;
    }
    return lo;
  }
 
  
  
  public static int binary_search_real(int lo,int hi)
  {
    while not to terminate
    {
      int mid=lo+(hi-lo)/2;
      if(p(mid))
        hi=mid;
      else
        lo=mid;
    }
    return lo;
  }
  
  public static void main(String[] args)
  {
    int[] a={0,5,13,19,22,41,55,68,72,81,98};
    
    System.out.println(binary_search(a,55));
    System.out.println(lower_bound(0,4));
    System.out.println(upper_bound(0,4));
  }
}