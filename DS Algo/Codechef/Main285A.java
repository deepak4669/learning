import java.util.Scanner;
public class Main285A
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int k=sc.nextInt();
    int[] a=new int[n];
    if(k==0)
    {
      for(int i=1;i<=n;i++)
        System.out.print(i+" ");
    }
    else
    {
      int t=0;
      for(int i=n;i>0;i--)
        a[t++]=i;
      int index=n-1;
      for(int i=0;i<n-k-1;i++)
      {
        exch(a,index,index-1);
        index-=2;
      }
      for(int i=0;i<n;i++)
        System.out.print(a[i]+" ");
    }
  }
  public static void exch(int[] a,int i,int j)
  {
    int temp=a[i];
    a[i]=a[j];
    a[j]=temp;
  }
}
      
      

      
