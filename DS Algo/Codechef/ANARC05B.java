import java.util.*;
import java.io.*;
public class ANARC05B
{
  
  static int[] v;
  static int[] v2;
  public static void main(String[] args)
  {
    Reader sc=new Reader();
    while(true)
    {
      int n=sc.nextInt();
      v=new int[n];
      
      for(int i=0;i<n;i++)
        v[i]=sc.nextInt();
      int m=sc.nextInt();
      for(int i=0;i<m;i++)
        v2[i]=sc.nextInt();
      int i=n;
      int j=m;
      int sum1=0;
      int sum2=0;
      while(true)
      {
        if(vi
        