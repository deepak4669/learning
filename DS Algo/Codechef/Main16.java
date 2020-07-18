import java.util.Scanner;
import java.util.Arrays;
public class Main16
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    int[] res=new int[t];
    
    for(int i=0;i<t;i++)
    {
      int n =sc.nextInt();
      int[] arrayM=new int[n];
      int[] arrayF=new int[n];
      
      for(int j=0;j<n;j++)
      {
        arrayM[j]=sc.nextInt();
      }
      for(int j=0;j<n;j++)
      {
        arrayF[j]=sc.nextInt();
      }
      res[i]=sum(arrayM,arrayF);
    }
    for(int i=0;i<t;i++)
    {
      System.out.println(res[i]);
    }
  }
  public static int sum(int[] a,int[] b)
  {
    Arrays.sort(a);
    Arrays.sort(b);
    int res=0;
    for(int i=0;i<a.length;i++)
    {
      res+=a[i]*b[i];
    }
    return res;
  }
}