import java.util.Scanner;
public class Main368B
{
  static int suffix[];
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int[] a=new int[n];
    suffix=new int[n];
    for(int i=0;i<n;i++)
      a[i]=sc.nextInt();
    preprocess(a,suffix);
    //int[] l=new int[m];
    for(int i=0;i<m;i++)
    {
      int l=sc.nextInt();
      System.out.println(suffix[l-1]);
    }
  }
  public static void preprocess(int[] a)
  {
    for(int i=a.length-1;i>=0;i--)
    {
      if(i==a.length-1) suffix[i]=1;
      else
      {
        suffix[i]=suffix[i+1];
        if(contains(a[i],i+1,a))
          suffix[i]++;
      }
    }
  }
  public static boolean contains(int v,int j,int[] a)
  {
    for(int i=j;i<a.length;i++)
    {
      if(a[i]==v) return true;
    }
    return false;
  }
}
    
    
      
    
      