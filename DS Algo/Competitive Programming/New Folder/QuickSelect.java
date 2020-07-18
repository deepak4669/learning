import java.util.*;
import java.io.*;
import java.lang.*;

public class QuickSelect
{
  public static void main(String[] args)
  {
  }
  public static int  select(int[] a,int k)
  {
    shuffle(a);
    int lo=0;
    int hi=a.length-1;
    while(hi>lo)
    {
      int j=partition(a,lo,hi);
      if(j<k) lo=j+1;
      else if(j>k) hi=j-1;
      else return a[k];
    }
    return a[k];
  }
  public static int partition(int[] a,int lo,int hi)
  {
    int i=lo;
    int j=hi+1;
    while(true)
    {
      while(a[++i]<a[lo])
      {
        if(i==hi)
          break;
      }
      while(a[--j]>a[lo])
      {
        if(j==lo)
          break;
      }
      if(i>=j) break;
      int temp=a[i];
      a[i]=a[j];
      a[j]=a[i];
    }
    int temp=a[lo];
    a[lo]=a[j];
    a[j]=temp;
    return j;
  }
  public static void shuffle(int[] a)
  {
    ArrayList<Integer> arr=new ArrayList<Integer>();
    for(int i=0;i<a.length;i++)
    {
      arr.add(a[i]);
    }
    Collections.sort(arr);
    for(int i=0;i<a.length;i++)
    {
      a[i]=arr.get(i);
    }
  }
        
    
}