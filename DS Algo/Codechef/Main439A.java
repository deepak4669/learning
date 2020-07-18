import java.util.*;
import java.io.*;
public class Main439A
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int d=sc.nextInt();
    int[] t=new int[n];
    int sum=0;
    for(int i=0;i<n;i++)
    {
      t[i]=sc.nextInt();
      sum+=t[i];
    }
    sum+=(n-1)*10;
    if(sum>d) System.out.println(-1);
    else
    {
      int jokes=(d-sum)/5+2*(n-1);
      System.out.println(jokes);
    }
  }
}
    